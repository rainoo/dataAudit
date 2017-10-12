package com.jmj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jmj.common.ProjectClassifyCode;
import com.jmj.common.selectCommon;
import com.jmj.entity.CaaeAssess;
import com.jmj.entity.CaaeBidinfo;
import com.jmj.entity.CaaeBuyer;
import com.jmj.entity.CaaeFile;
import com.jmj.entity.CaaeFinance;
import com.jmj.entity.CaaeHolder;
import com.jmj.entity.CaaeObject;
import com.jmj.entity.CaaeProject;
import com.jmj.entity.CaaeSeller;
import com.jmj.entity.CaaeTenderinfo;
import com.jmj.entity.CaaeTrade;
import com.jmj.entity.GqCaaeProject;
import com.jmj.entity.SwCaaeProject;
import com.jmj.entity.ZzCaaeProject;

@Controller
@RequestMapping("proinfo")
public class ProInfoController extends selectCommon{

	@RequestMapping("index")
	public String index(HttpServletRequest request,HttpServletResponse response){
		String proTransId = request.getParameter("proTransId");
		String projectClassifyCode = request.getParameter("projectClassifyCode");
		CaaeProject caaeProject = this.selectCaaeProjectByTransId(proTransId);
		CaaeSeller caaeSeller = this.selectCaaeSellerByTransId(proTransId);
		CaaeAssess caaeAssess = this.selectCaaeAssessByTransId(proTransId);
		List<CaaeBuyer> listCaaeBuyer = this.selectCaaeBuyerByTransId(proTransId);
		List<CaaeFile> listCaaeFile = this.selectCaaeFileByTransId(proTransId);
		List<CaaeTrade> listCaaeTrade = this.selectCaaeTradeByTransId(proTransId);
		List<CaaeBidinfo> listCaaeBidinfo = this.selectCaaeBidinfoByTransId(proTransId);
		List<CaaeTenderinfo> listCaaeTenderinfo = this.selectCaaeTenderinfoByTransId(proTransId);
		
		if(ProjectClassifyCode.entity.getCode().equals(projectClassifyCode)){//实物
			SwCaaeProject swCaaeProject = this.selectSwCaaeProjectByTransId(proTransId);
			request.setAttribute("swCaaeProject", swCaaeProject);
		}else if(ProjectClassifyCode.property.getCode().equals(projectClassifyCode)){//股权
			GqCaaeProject gqCaaeProject = this.selectGqCaaeProjectByTransId(proTransId);
			CaaeObject caaeObject = this.selectCaaeObjectByTransId(proTransId);
			CaaeFinance caaeFinance = this.selectCaaeFinanceByTransId(proTransId);
			List<CaaeHolder> listCaaeHolder = this.selectCaaeHolderByTransId(proTransId);
			request.setAttribute("gqCaaeProject", gqCaaeProject);
			request.setAttribute("caaeObject", caaeObject);
			request.setAttribute("caaeFinance", caaeFinance);
			request.setAttribute("listCaaeHolder", listCaaeHolder);
		}else if(ProjectClassifyCode.capital.getCode().equals(projectClassifyCode)){//增资
			ZzCaaeProject zzCaaeProject = this.selectZzCaaeProjectByTransId(proTransId);
			CaaeObject caaeObject = this.selectCaaeObjectByTransId(proTransId);
			CaaeFinance caaeFinance = this.selectCaaeFinanceByTransId(proTransId);
			List<CaaeHolder> listCaaeHolder = this.selectCaaeHolderByTransId(proTransId);
			request.setAttribute("zzCaaeProject", zzCaaeProject);
			request.setAttribute("caaeObject", caaeObject);
			request.setAttribute("caaeFinance", caaeFinance);
			request.setAttribute("listCaaeHolder", listCaaeHolder);
		}
		
		request.setAttribute("caaeProject", caaeProject);
		request.setAttribute("caaeSeller", caaeSeller);
		request.setAttribute("caaeAssess", caaeAssess);
		request.setAttribute("listCaaeBuyer", listCaaeBuyer);
		request.setAttribute("listCaaeTrade", listCaaeTrade);
		request.setAttribute("listCaaeBidinfo", listCaaeBidinfo);
		request.setAttribute("listCaaeTenderinfo", listCaaeTenderinfo);
		request.setAttribute("listCaaeFile", listCaaeFile);
		return this.getUrl(projectClassifyCode);
	}
	
	/**
	 * 获取页面
	 * @param projectClassifyCode
	 * @return
	 */
	private String getUrl(String projectClassifyCode){
		if(ProjectClassifyCode.entity.getCode().equals(projectClassifyCode)){
			return "swDataInfo";
		}else if(ProjectClassifyCode.property.getCode().equals(projectClassifyCode)){
			return "gqDataInfo";
		}else if(ProjectClassifyCode.capital.getCode().equals(projectClassifyCode)){
			return "zzDataInfo";
		}
		return null;
	}
	
	@RequestMapping("selectBuyer")
	public String selectBuyer(HttpServletRequest request,HttpServletResponse response){
		String buyerId = request.getParameter("buyerId");
		CaaeBuyer caaeBuyer = caaeBuyerService.selectByPrimaryKey(buyerId);
		request.setAttribute("caaeBuyer", caaeBuyer);
		return "/data/buyer";
	}
	
	@RequestMapping("selectTrade")
	public String selectTrade(HttpServletRequest request,HttpServletResponse response){
		String tradeId = request.getParameter("tradeId");
		CaaeTrade caaeTrade = caaeTradeService.selectByPrimaryKey(tradeId);
		request.setAttribute("caaeTrade", caaeTrade);
		return "/data/trade";
	}
	
}

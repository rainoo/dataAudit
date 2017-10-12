package com.jmj.common;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jmj.entity.CaaeAssess;
import com.jmj.entity.CaaeAssessExample;
import com.jmj.entity.CaaeBidinfo;
import com.jmj.entity.CaaeBidinfoExample;
import com.jmj.entity.CaaeBuyer;
import com.jmj.entity.CaaeBuyerExample;
import com.jmj.entity.CaaeFile;
import com.jmj.entity.CaaeFileExample;
import com.jmj.entity.CaaeFinance;
import com.jmj.entity.CaaeFinanceExample;
import com.jmj.entity.CaaeHolder;
import com.jmj.entity.CaaeHolderExample;
import com.jmj.entity.CaaeObject;
import com.jmj.entity.CaaeObjectExample;
import com.jmj.entity.CaaeProject;
import com.jmj.entity.CaaeProjectExample;
import com.jmj.entity.CaaeSeller;
import com.jmj.entity.CaaeSellerExample;
import com.jmj.entity.CaaeTenderinfo;
import com.jmj.entity.CaaeTenderinfoExample;
import com.jmj.entity.CaaeTrade;
import com.jmj.entity.CaaeTradeExample;
import com.jmj.entity.GqCaaeProject;
import com.jmj.entity.GqCaaeProjectExample;
import com.jmj.entity.SwCaaeProject;
import com.jmj.entity.SwCaaeProjectExample;
import com.jmj.entity.ZzCaaeProject;
import com.jmj.entity.ZzCaaeProjectExample;
import com.jmj.service.ICaaeAssessService;
import com.jmj.service.ICaaeBidinfoService;
import com.jmj.service.ICaaeBuyerService;
import com.jmj.service.ICaaeFileService;
import com.jmj.service.ICaaeFinanceService;
import com.jmj.service.ICaaeHolderService;
import com.jmj.service.ICaaeObjectService;
import com.jmj.service.ICaaeProjectService;
import com.jmj.service.ICaaeSellerService;
import com.jmj.service.ICaaeTenderinfoService;
import com.jmj.service.ICaaeTradeService;
import com.jmj.service.IGqCaaeProjectService;
import com.jmj.service.ISwCaaeProjectService;
import com.jmj.service.IZzCaaeProjectService;

/**
 * 数据查询工具类
 * 查询条件：proTransId
 * @author jthao
 */
@Service
public class selectCommon {
	
	@Resource
	protected ICaaeProjectService caaeProjectService;
	@Resource
	protected ISwCaaeProjectService swCaaeProjectService;
	@Resource
	protected IGqCaaeProjectService gqCaaeProjectService;
	@Resource
	protected IZzCaaeProjectService zzCaaeProjectService;
	@Resource
	protected ICaaeSellerService caaeSellerService;
	@Resource
	protected ICaaeAssessService caaeAssessService;
	@Resource
	protected ICaaeObjectService caaeObjectService;
	@Resource
	protected ICaaeFinanceService caaeFinanceService;
	@Resource
	protected ICaaeHolderService caaeHolderService;
	@Resource
	protected ICaaeBuyerService caaeBuyerService;
	@Resource
	protected ICaaeTradeService caaeTradeService;
	@Resource
	protected ICaaeBidinfoService caaeBidinfoService;
	@Resource
	protected ICaaeTenderinfoService caaeTenderinfoService;
	@Resource
	protected ICaaeFileService caaeFileService;
	
	/**
	 * 根据proTransId查询总项目信息
	 * @param proTransId
	 * @return
	 */
	public CaaeProject selectCaaeProjectByTransId(String proTransId){
		CaaeProject caaeProject = new CaaeProject();
		CaaeProjectExample caaeProjectExample = new CaaeProjectExample();
		caaeProjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeProject> listPro = caaeProjectService.selectByExample(caaeProjectExample);
		if(UtilCommon.listNotNull(listPro)){
			caaeProject = listPro.get(0);
		}
		return caaeProject;
	}
	
	/**
	 * 根据proTransId查询实物项目信息
	 * @param proTransId
	 * @return
	 */
	public SwCaaeProject selectSwCaaeProjectByTransId(String proTransId){
		SwCaaeProject swCaaeProject = new SwCaaeProject();
		SwCaaeProjectExample swCaaeProjectExample = new SwCaaeProjectExample();
		swCaaeProjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<SwCaaeProject> listSwPro = swCaaeProjectService.selectByExample(swCaaeProjectExample);
		if(UtilCommon.listNotNull(listSwPro)){
			swCaaeProject = listSwPro.get(0);
		}
		return swCaaeProject;
	}
	
	/**
	 * 根据proTransId查询股权项目信息
	 * @param proTransId
	 * @return
	 */
	public GqCaaeProject selectGqCaaeProjectByTransId(String proTransId){
		GqCaaeProject gqCaaeProject = new GqCaaeProject();
		GqCaaeProjectExample gqCaaeProjectExample = new GqCaaeProjectExample();
		gqCaaeProjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<GqCaaeProject> listGqPro = gqCaaeProjectService.selectByExample(gqCaaeProjectExample);
		if(UtilCommon.listNotNull(listGqPro)){
			gqCaaeProject = listGqPro.get(0);
		}
		return gqCaaeProject;
	}
	/**
	 * @Description:根据proTransId查询增资项目信息
	 * @param proTransId
	 * @return
	 * ZzCaaeProject
	 */
	public ZzCaaeProject selectZzCaaeProjectByTransId(String proTransId){
		ZzCaaeProject zzCaaeProject = new ZzCaaeProject();
		ZzCaaeProjectExample zzCaaeProjectExample = new ZzCaaeProjectExample();
		zzCaaeProjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<ZzCaaeProject> listZzPro = zzCaaeProjectService.selectByExample(zzCaaeProjectExample);
		if(UtilCommon.listNotNull(listZzPro)){
			zzCaaeProject=listZzPro.get(0);
		}
		return zzCaaeProject;
	}
	
	/**
	 * 根据proTransId查询转让方信息
	 * @param proTransId
	 * @return
	 */
	public CaaeSeller selectCaaeSellerByTransId(String proTransId){
		CaaeSeller caaeSeller = new CaaeSeller();
		CaaeSellerExample caaeSellerExample = new CaaeSellerExample();
		caaeSellerExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeSeller> listSeller = caaeSellerService.selectByExample(caaeSellerExample);
		if(UtilCommon.listNotNull(listSeller)){
			caaeSeller = listSeller.get(0);
		}
		return caaeSeller;
	}
	
	/**
	 * 根据proTransId查询评估信息
	 * @param proTransId
	 * @return
	 */
	public CaaeAssess selectCaaeAssessByTransId(String proTransId){
		CaaeAssess caaeAssess = new  CaaeAssess();;
		CaaeAssessExample caaeAssessExample = new CaaeAssessExample();
		caaeAssessExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeAssess> listAssess = caaeAssessService.selectByExample(caaeAssessExample);
		if(UtilCommon.listNotNull(listAssess)){
			caaeAssess = listAssess.get(0);
		}
		return caaeAssess;
	}

	/**
	 * 根据proTransId查询标的企业主体信息
	 * @param proTransId
	 * @return
	 */
	public CaaeObject selectCaaeObjectByTransId(String proTransId){
		CaaeObject caaeObject = new CaaeObject();
		CaaeObjectExample caaeObjectExample = new CaaeObjectExample();
		caaeObjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeObject> listObject = caaeObjectService.selectByExample(caaeObjectExample);
		if(UtilCommon.listNotNull(listObject)){
			caaeObject = listObject.get(0);
		}
		return caaeObject;
	}
	
	/**
	 * 根据proTransId查询标的企业财务信息
	 * @param proTransId
	 * @return
	 */
	public CaaeFinance selectCaaeFinanceByTransId(String proTransId){
		CaaeFinance caaeFinance = new CaaeFinance();
		CaaeFinanceExample caaeFinanceExample = new CaaeFinanceExample();
		caaeFinanceExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeFinance> listFinance = caaeFinanceService.selectByExample(caaeFinanceExample);
		if(UtilCommon.listNotNull(listFinance)){
			caaeFinance = listFinance.get(0);
		}
		return caaeFinance;
	}
	
	/**
	 * 根据proTransId查询标的企业股东信息
	 * @param proTransId
	 * @return
	 */
	public List<CaaeHolder> selectCaaeHolderByTransId(String proTransId){
		CaaeHolderExample caaeHolderExample = new CaaeHolderExample();
		caaeHolderExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeHolder> listCaaeHolder = caaeHolderService.selectByExample(caaeHolderExample);
		return listCaaeHolder;
	}
	
	/**
	 * 根据proTransId查询受让方信息
	 * @param proTransId
	 * @return
	 */
	public List<CaaeBuyer> selectCaaeBuyerByTransId(String proTransId){
		CaaeBuyerExample caaeBuyerExample = new CaaeBuyerExample();
		caaeBuyerExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeBuyer> listCaaeBuyer = caaeBuyerService.selectByExample(caaeBuyerExample);
		return listCaaeBuyer;
	}
	
	/**
	 * 根据proTransId查询成交信息
	 * @param proTransId
	 * @return
	 */
	public List<CaaeTrade> selectCaaeTradeByTransId(String proTransId){
		CaaeTradeExample caaeTradeExample = new CaaeTradeExample();
		caaeTradeExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeTrade> listCaaeTrade = caaeTradeService.selectByExample(caaeTradeExample);
		return listCaaeTrade;
	}
	
	/**
	 * 根据proTransId查询竞价过程信息
	 * @param proTransId
	 * @return
	 */
	public List<CaaeBidinfo> selectCaaeBidinfoByTransId(String proTransId){
		CaaeBidinfoExample caaeBidinfoExample = new CaaeBidinfoExample();
		caaeBidinfoExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeBidinfo> listCaaeBidinfo = caaeBidinfoService.selectByExample(caaeBidinfoExample);
		return listCaaeBidinfo;
	}
	
	/**
	 * 根据proTransId查询投标记录信息
	 * @param proTransId
	 * @return
	 */
	public List<CaaeTenderinfo> selectCaaeTenderinfoByTransId(String proTransId){
		CaaeTenderinfoExample caaeTenderinfoExample = new CaaeTenderinfoExample();
		caaeTenderinfoExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeTenderinfo> listCaaeTenderinfo = caaeTenderinfoService.selectByExample(caaeTenderinfoExample);
		return listCaaeTenderinfo;
	}
	
	/**
	 * 根据proTransId查询附件信息
	 * @param proTransId
	 * @return
	 */
	public List<CaaeFile> selectCaaeFileByTransId(String proTransId){
		CaaeFileExample caaeFileExample = new CaaeFileExample();
		caaeFileExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeFile> listCaaeFile = caaeFileService.selectByExample(caaeFileExample);
		return listCaaeFile;
	}
	
}

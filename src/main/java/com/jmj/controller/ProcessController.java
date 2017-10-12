package com.jmj.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.jmj.common.AuditType;
import com.jmj.common.ProjectClassifyCode;
import com.jmj.common.ProjectType;
import com.jmj.common.StageCode;
import com.jmj.entity.CaaeAddPub;
import com.jmj.entity.CaaeAddPubExample;
import com.jmj.entity.CaaeAppraisal;
import com.jmj.entity.CaaeAppraisalExample;
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
import com.jmj.entity.CaaeNegoinfo;
import com.jmj.entity.CaaeNegoinfoExample;
import com.jmj.entity.CaaeObject;
import com.jmj.entity.CaaeObjectExample;
import com.jmj.entity.CaaeProject;
import com.jmj.entity.CaaeProject2;
import com.jmj.entity.CaaeProject2Example;
import com.jmj.entity.CaaeProjectExample;
import com.jmj.entity.CaaeProjectExample.Criteria;
import com.jmj.entity.CaaeSeller;
import com.jmj.entity.CaaeSellerExample;
import com.jmj.entity.CaaeTenderinfo;
import com.jmj.entity.CaaeTenderinfoExample;
import com.jmj.entity.CaaeTrade;
import com.jmj.entity.CaaeTradeExample;
import com.jmj.entity.GqCaaeProject;
import com.jmj.entity.GqCaaeProjectExample;
import com.jmj.entity.ProjectStatistics;
import com.jmj.entity.SwCaaeProject;
import com.jmj.entity.SwCaaeProjectExample;
import com.jmj.entity.ZzCaaeProject;
import com.jmj.entity.ZzCaaeProjectExample;
import com.jmj.service.impl.CaaeAddPubServiceImpl;
import com.jmj.service.impl.CaaeAppraisalServiceImpl;
import com.jmj.service.impl.CaaeAssessServiceImpl;
import com.jmj.service.impl.CaaeBidinfoServiceImpl;
import com.jmj.service.impl.CaaeBuyerServiceImpl;
import com.jmj.service.impl.CaaeFileServiceImpl;
import com.jmj.service.impl.CaaeFinanceServiceImpl;
import com.jmj.service.impl.CaaeHolderServiceImpl;
import com.jmj.service.impl.CaaeNegoinfoServiceImpl;
import com.jmj.service.impl.CaaeObjectServiceImpl;
import com.jmj.service.impl.CaaeProject2ServiceImpl;
import com.jmj.service.impl.CaaeProjectServiceImpl;
import com.jmj.service.impl.CaaeSellerServiceImpl;
import com.jmj.service.impl.CaaeTenderinfoServiceImpl;
import com.jmj.service.impl.CaaeTradeServiceImpl;
import com.jmj.service.impl.GqCaaeProjectServiceImpl;
import com.jmj.service.impl.InsertService;
import com.jmj.service.impl.SwCaaeProjectServiceImpl;
import com.jmj.service.impl.ZzCaaeProjectServiceImpl;
import com.jmj.utils.StringUtils;
import com.jmj.utils.TypeConvert;

@Controller
@RequestMapping("process")
public class ProcessController {

	@Resource
	private CaaeProjectServiceImpl caaeProjectService;
	@Resource
	private CaaeProject2ServiceImpl caaeProject2Service;
	@Resource
	private CaaeAddPubServiceImpl caaeAddPubService;
	@Resource
	private CaaeAppraisalServiceImpl caaeAppraisalService;
	@Resource
	private CaaeAssessServiceImpl caaeAssessService;
	@Resource
	private CaaeBidinfoServiceImpl caaeBidinfoService;
	@Resource
	private CaaeBuyerServiceImpl caaeBuyerService;
	@Resource
	private CaaeFileServiceImpl caaeFileService;
	@Resource
	private CaaeFinanceServiceImpl caaeFinanceService;
	@Resource
	private CaaeHolderServiceImpl caaeHolderService;
	@Resource
	private CaaeNegoinfoServiceImpl caaeNegoinfoService;
	@Resource
	private CaaeObjectServiceImpl caaeObjectService;
	@Resource
	private CaaeSellerServiceImpl caaeSellerService;
	@Resource
	private CaaeTenderinfoServiceImpl caaeTenderinfoService;
	@Resource
	private CaaeTradeServiceImpl caaeTradeService;
	@Resource
	private GqCaaeProjectServiceImpl gqCaaeProjectService;
	@Resource
	private SwCaaeProjectServiceImpl swCaaeProjectService;
	@Resource
	private InsertService insertService;
	@Resource
	private ZzCaaeProjectServiceImpl zzCaaeProjectService;

	/**
	 * 
	 * @Description:进入审核页面
	 * @param type
	 *            （品类）
	 * @param request
	 * @param response
	 * @return String
	 */
	@RequestMapping("index")
	public String index(String type, HttpServletRequest request,
			HttpServletResponse response) {
		CaaeProjectExample example = new CaaeProjectExample();
		Criteria createCriteria = example.createCriteria();
		if (StringUtils.stringIsNull(type)) {
			createCriteria
					.andProjectClassifyCodeEqualTo(ProjectType.PHYSICAL_ASSETS
							.getType());
		} else {
			createCriteria.andProjectClassifyCodeEqualTo(type);
		}

		int totalCount = caaeProjectService.countByExample(example);
		request.setAttribute("totalCount", totalCount);
		if (StringUtils.stringIsNull(type)) {
			request.setAttribute("type", ProjectType.PHYSICAL_ASSETS.getType());
			return "showData";
		}
		if (ProjectType.PHYSICAL_ASSETS.getType().equals(type)) {
			request.setAttribute("type", ProjectType.PHYSICAL_ASSETS.getType());
		} else if (ProjectType.EQUITY_PRODUCTION.getType().equals(type)) {
			request.setAttribute("type",
					ProjectType.EQUITY_PRODUCTION.getType());
		} else if (ProjectType.INCREASE_INVESTMENT.getType().equals(type)) {
			request.setAttribute("type",
					ProjectType.INCREASE_INVESTMENT.getType());
		} else if (ProjectType.CULTURAL.getType().equals(type)) {
			request.setAttribute("type", ProjectType.CULTURAL.getType());
		} else if (ProjectType.ENVIRONMENTAL.getType().equals(type)) {
			request.setAttribute("type", ProjectType.ENVIRONMENTAL.getType());
		} else if (ProjectType.FINANCIAL_ASSETS.getType().equals(type)) {
			request.setAttribute("type", ProjectType.FINANCIAL_ASSETS);
		} else if (ProjectType.FINANCING_SERVER.getType().equals(type)) {
			request.setAttribute("type", ProjectType.FINANCING_SERVER.getType());
		} else if (ProjectType.FOREST_OWNERSHIP.getType().equals(type)) {
			request.setAttribute("type", ProjectType.FOREST_OWNERSHIP.getType());
		} else if (ProjectType.LITIGATION_ASSETS.getType().equals(type)) {
			request.setAttribute("type",
					ProjectType.LITIGATION_ASSETS.getType());
		} else if (ProjectType.MINERAL_RIGHTS.getType().equals(type)) {
			request.setAttribute("type", ProjectType.MINERAL_RIGHTS.getType());
		} else if (ProjectType.RURAL_PROPERTY.getType().equals(type)) {
			request.setAttribute("type", ProjectType.RURAL_PROPERTY.getType());
		} else if (ProjectType.TECHNOLOGICAL.getType().equals(type)) {
			request.setAttribute("type", ProjectType.TECHNOLOGICAL.getType());
		}
		return "showData";
	}

	/**
	 * 
	 * @Description:根据条件查询
	 * @param time1
	 *            (上报日期)
	 * @param time2
	 *            (上报日期)
	 * @param project
	 * @param request
	 * @param response
	 * @return String
	 */
	@RequestMapping("select")
	public String select(String time1, String time2, CaaeProject project,
			HttpServletRequest request, HttpServletResponse response) {
		CaaeProjectExample example = this.getProjectExample(project, time1,
				time2);
		int totalCount = caaeProjectService.countByExample(example);
		String json = "{totalCount:" + totalCount + "}";
		this.outputJson(response, JSONObject.parseObject(json));
		return null;
	}

	/**
	 * 
	 * @Description:数据展示
	 * @param time1
	 *            (上报日期)
	 * @param time2
	 * @param project
	 * @param request
	 * @param response
	 * @return String
	 */
	@RequestMapping("show")
	public String showData(String time1, String time2, CaaeProject project,
			HttpServletRequest request, HttpServletResponse response) {
		int start = 1;
		int end = 25;
		int currPage = Integer.parseInt(request.getParameter("currPage"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		if (currPage > 0) {
			currPage = currPage - 1;
			start = currPage * limit + 1;
			end = (currPage + 1) * limit;
		}
		CaaeProjectExample example = this.getProjectExample(project, time1,
				time2);
		example.setEnd(end);
		example.setStart(start);
		List<CaaeProject> projectList = caaeProjectService
				.selectByPage(example);
		request.setAttribute("projectName", "测试项目");
		request.setAttribute("projectList", projectList);
		return "dataTemplate";
	}

	/**
	 * 
	 * @Description: 批量审核
	 * @param auditStatus
	 *            (审核状态)
	 * @param auditOpinion
	 *            (审核意见)
	 * @param auditUser
	 *            (审核人)
	 * @param request
	 * @param response
	 * @return String
	 */
	@RequestMapping("audit")
	public String auditData(String auditStatus, String auditOpinion,
			String auditUser, HttpServletRequest request,
			HttpServletResponse response) {
		JSONObject json = new JSONObject();
		String auditData = request.getParameter("auditData");
		CaaeProjectExample example = new CaaeProjectExample();
		example.createCriteria().andProTransIdIn(
				Arrays.asList(auditData.split(",")));
		List<CaaeProject> selectByExample = caaeProjectService
				.selectByExample(example);
		
		if (selectByExample == null || selectByExample.size() < 1) {
			json.put("msg", "未选择需审核的数据");
		} else {
			for (CaaeProject project : selectByExample) {
				CaaeProject2Example example2 = new CaaeProject2Example();
				String projectId = project.getProjectId();
				String projectClassifyCode = project.getProjectClassifyCode();
				String tradInstitutionId = project.getTradInstitutionId();
				String businessStatus = project.getBusinessStatus();
				if ("A01".equals(businessStatus)) {
					example2.createCriteria().andProjectIdEqualTo(projectId)
							.andProjectClassifyCodeEqualTo(projectClassifyCode)
							.andTradInstitutionIdEqualTo(tradInstitutionId)
							.andBusinessStatusEqualTo("A01");
					List<CaaeProject2> selectByExample2 = caaeProject2Service
							.selectByExample(example2);
					if (selectByExample2 == null || selectByExample2.size() < 1) {
						String result = this.save(project, selectByExample2,
								"save", auditStatus, auditOpinion, auditUser);
						json.put("msg", result);
					} else {
						String result = this.save(project, selectByExample2,
								"deleteSave", auditStatus, auditOpinion,
								auditUser);
						json.put("msg", result);
					}
				} else {
					example2.createCriteria().andProjectIdEqualTo(projectId)
							.andProjectClassifyCodeEqualTo(projectClassifyCode)
							.andTradInstitutionIdEqualTo(tradInstitutionId)
							.andBusinessStatusNotEqualTo("A01");
					List<CaaeProject2> selectByExample2 = caaeProject2Service
							.selectByExample(example2);
					if (selectByExample2 == null || selectByExample2.size() < 1) {
						String result = this.save(project, selectByExample2,
								"save", auditStatus, auditOpinion, auditUser);
						json.put("msg", result);
					} else {
						String result = this.save(project, selectByExample2,
								"deleteSave", auditStatus, auditOpinion,
								auditUser);
						json.put("msg", result);
					}
				}

			}
		}
		this.outputJson(response, json);
		return null;
	}

	/**
	 * 
	 * @Description:save
	 * @param project
	 * @param type
	 * @param auditStatus
	 * @param auditOpinion
	 * @param auditUser
	 * @return String
	 */
	public String save(CaaeProject project, List<CaaeProject2> project2List,
			String type, String auditStatus, String auditOpinion,
			String auditUser) {
		String result = "";
		Map<String, Object> map = new HashMap<String, Object>();
		CaaeProject2 project2 = JSONObject.parseObject(
				JSONObject.toJSONString(project), CaaeProject2.class);
		if (auditOpinion == null) {
			auditOpinion = "审核通过";
		}
		project2.setAuditOpinion(auditOpinion);
		Date auditDate = new Date();
		project2.setAuditTime(auditDate);
		if (auditStatus == null) {
			auditStatus = AuditType.APPROVAL.getType();
		}
		project2.setAuditStatus(auditStatus);
		project2.setAuditUser(auditUser);
		map.put("project2", project2);
		String proTransId = project.getProTransId();
		CaaeAddPubExample example = new CaaeAddPubExample();
		example.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeAddPub> list = caaeAddPubService.selectByExample(example);

		CaaeAppraisalExample caaeAppraisalExample = new CaaeAppraisalExample();
		caaeAppraisalExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeAppraisal> selectByExample = caaeAppraisalService
				.selectByExample(caaeAppraisalExample);

		CaaeAssessExample caaeAssessExample = new CaaeAssessExample();
		caaeAssessExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeAssess> selectByExample2 = caaeAssessService
				.selectByExample(caaeAssessExample);

		CaaeBidinfoExample caaeBidinfoExample = new CaaeBidinfoExample();
		caaeBidinfoExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeBidinfo> selectByExample3 = caaeBidinfoService
				.selectByExample(caaeBidinfoExample);

		CaaeBuyerExample caaeBuyerExample = new CaaeBuyerExample();
		caaeBuyerExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeBuyer> selectByExample4 = caaeBuyerService
				.selectByExample(caaeBuyerExample);

		CaaeFileExample caaeFileExample = new CaaeFileExample();
		caaeFileExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeFile> selectByExample5 = caaeFileService
				.selectByExample(caaeFileExample);

		CaaeFinanceExample caaeFinanceExample = new CaaeFinanceExample();
		caaeFinanceExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeFinance> selectByExample6 = caaeFinanceService
				.selectByExample(caaeFinanceExample);

		CaaeHolderExample caaeHolderExample = new CaaeHolderExample();
		caaeHolderExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeHolder> selectByExample7 = caaeHolderService
				.selectByExample(caaeHolderExample);

		CaaeNegoinfoExample caaeNegoinfoExample = new CaaeNegoinfoExample();
		caaeNegoinfoExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeNegoinfo> selectByExample8 = caaeNegoinfoService
				.selectByExample(caaeNegoinfoExample);

		CaaeObjectExample caaeObjectExample = new CaaeObjectExample();
		caaeObjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeObject> selectByExample9 = caaeObjectService
				.selectByExample(caaeObjectExample);

		CaaeSellerExample caaeSellerExample = new CaaeSellerExample();
		caaeSellerExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeSeller> selectByExample10 = caaeSellerService
				.selectByExample(caaeSellerExample);

		CaaeTenderinfoExample caaeTenderinfoExample = new CaaeTenderinfoExample();
		caaeTenderinfoExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeTenderinfo> selectByExample11 = caaeTenderinfoService
				.selectByExample(caaeTenderinfoExample);

		CaaeTradeExample caaeTradeExample = new CaaeTradeExample();
		caaeTradeExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<CaaeTrade> selectByExample12 = caaeTradeService
				.selectByExample(caaeTradeExample);

		GqCaaeProjectExample gqCaaeProjectExample = new GqCaaeProjectExample();
		gqCaaeProjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<GqCaaeProject> selectByExample13 = gqCaaeProjectService
				.selectByExample(gqCaaeProjectExample);

		SwCaaeProjectExample swCaaeProjectExample = new SwCaaeProjectExample();
		swCaaeProjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<SwCaaeProject> selectByExample14 = swCaaeProjectService
				.selectByExample(swCaaeProjectExample);

		ZzCaaeProjectExample zzCaaeProjectExample = new ZzCaaeProjectExample();
		zzCaaeProjectExample.createCriteria().andProTransIdEqualTo(proTransId);
		List<ZzCaaeProject> selectByExample15 = zzCaaeProjectService
				.selectByExample(zzCaaeProjectExample);

		map.put("addPub", list);
		map.put("appraisal", selectByExample);
		map.put("assess", selectByExample2);
		map.put("bidinfo", selectByExample3);
		map.put("buyer", selectByExample4);
		map.put("file", selectByExample5);
		map.put("finance", selectByExample6);
		map.put("holder", selectByExample7);
		map.put("negoinfo", selectByExample8);
		map.put("object", selectByExample9);
		map.put("seller", selectByExample10);
		map.put("tenderinfo", selectByExample11);
		map.put("trade", selectByExample12);
		map.put("gcProject", selectByExample13);
		map.put("scProject", selectByExample14);
		map.put("zzProject", selectByExample15);
		if ("save".equals(type)) {
			result = insertService.insert(map);
		} else {
			result = insertService.deleteAndInsert(map, project2List);
		}
		if ("T".equals(result)) {
			CaaeProject caaeProject = new CaaeProject();
			caaeProject.setProTransId(proTransId);
			caaeProject.setAuditOpinion(auditOpinion);
			caaeProject.setAuditStatus(auditStatus);
			caaeProject.setAuditTime(auditDate);
			caaeProject.setAuditUser(auditUser);
			caaeProjectService.updateByPrimaryKeySelective(caaeProject);
		}
		return result;
	}

	/**
	 * 
	 * @Description:查询条件
	 * @param project
	 * @param time1
	 * @param time2
	 * @return CaaeProjectExample
	 */
	public CaaeProjectExample getProjectExample(CaaeProject project,
			String time1, String time2) {
		CaaeProjectExample example = new CaaeProjectExample();
		Criteria createCriteria = example.createCriteria();
		// 项目编号
		if (!StringUtils.stringIsNull(project.getProjectCode())) {
			createCriteria.andProjectCodeEqualTo(project.getProjectCode());
		}
		// 项目名称
		if (!StringUtils.stringIsNull(project.getProjectName())) {
			createCriteria.andProjectNameLike("%" + project.getProjectName()
					+ "%");
		}
		// 上报日期
		if (!StringUtils.stringIsNull(time1)) {
			if (StringUtils.stringIsNull(time2)) {
				createCriteria.andReportTimeBetween(TypeConvert.toDate(time1,
						"yyyy/MM/dd"), TypeConvert.toDate(
						TypeConvert.dateToString(new Date(), "yyyy/MM/dd"),
						"yyyy/MM/dd"));
			} else {
				createCriteria.andReportTimeBetween(
						TypeConvert.toDate(time1, "yyyy/MM/dd"),
						TypeConvert.toDate(time2, "yyyy/MM/dd"));
			}
		}
		// 资产分类
		if ("T".equals(project.getIsGz())) {
			createCriteria.andIsGzEqualTo("T");
		} else if ("F".equals(project.getIsGz())) {
			createCriteria.andIsGzEqualTo("F");
		}
		// 所属行业
		if (!StringUtils.stringIsNull(project.getIndustryCode())) {
			if (!"all".equals(project.getIndustryCode())) {
				createCriteria
						.andIndustryCodeEqualTo(project.getIndustryCode());
			}
		}
		// 挂牌价格
		if (project.getProjectPrice() != null) {
			createCriteria.andProjectPriceEqualTo(project.getProjectPrice());
		}
		// 项目状态
		if (!StringUtils.stringIsNull(project.getBusinessStatus())) {
			if (!project.getBusinessStatus().equals("all")) {
				createCriteria.andBusinessStatusEqualTo(project
						.getBusinessStatus());
			}
		}
		// 审核状态
		if (!StringUtils.stringIsNull(project.getAuditStatus())) {
			if (!project.getAuditStatus().equals("0")) {
				createCriteria.andAuditStatusEqualTo(new BigDecimal(project
						.getAuditStatus()));
			}
		}
		// 上报机构
		if (!StringUtils.stringIsNull(project.getTradInstitutionName())) {
			createCriteria.andTradInstitutionNameEqualTo(project
					.getTradInstitutionName());
		}
		// 所在区域
		if (!StringUtils.stringIsNull(project.getZone())) {
			createCriteria.andZoneEqualTo(project.getZone());
		}
		// 错误状态
		if (project.getSensitivityStatus() != null) {
			createCriteria.andSensitivityStatusEqualTo(project
					.getSensitivityStatus());
		}
		// 项目品类
		if (StringUtils.stringIsNull(project.getProjectClassifyCode())) {
			createCriteria
					.andProjectClassifyCodeEqualTo(ProjectType.PHYSICAL_ASSETS
							.getType());
		} else {
			createCriteria.andProjectClassifyCodeEqualTo(project
					.getProjectClassifyCode());
		}
		return example;
	}

	/**
	 * @Description:输出JSON
	 * @param response
	 * @param json
	 *            void
	 */
	public void outputJson(HttpServletResponse response, JSONObject json) {
		try {
			response.getWriter().print(json.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("DataParse")
	public String DataParse(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		List<ProjectStatistics> listPro = new ArrayList<ProjectStatistics>();
		List<CaaeProject> listCaaeProject = caaeProjectService.selectByTrad();
		for(CaaeProject caaeProject : listCaaeProject){
			ProjectStatistics pro = new ProjectStatistics();
			pro.setTradInstitutionId(caaeProject.getTradInstitutionId());
			pro.setTradInstitutionName(caaeProject.getTradInstitutionName());
			String entityCountA02 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.entity.getCode(),StageCode.A02.getCode(),"");
			String entityCountA06 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.entity.getCode(),StageCode.A06.getCode(),"");
			String propertyCountA02 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.property.getCode(),StageCode.A02.getCode(),"");
			String propertyCountA06 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.property.getCode(),StageCode.A06.getCode(),"");
			String capitalCountA02 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.capital.getCode(),StageCode.A02.getCode(),"");
			String capitalCountA06 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.capital.getCode(),StageCode.A06.getCode(),"");
			String todayEntityCountA02 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.entity.getCode(),StageCode.A02.getCode(),"today");
			String todayEntityCountA06 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.entity.getCode(),StageCode.A06.getCode(),"today");
			String todayPropertyCountA02 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.property.getCode(),StageCode.A02.getCode(),"today");
			String todayPropertyCountA06 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.property.getCode(),StageCode.A06.getCode(),"today");
			String todayCapitalCountA02 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.capital.getCode(),StageCode.A02.getCode(),"today");
			String todayCapitalCountA06 = this.DataCount(caaeProject.getTradInstitutionId(),ProjectClassifyCode.capital.getCode(),StageCode.A06.getCode(),"today");
			pro.setEntityCountA02(entityCountA02);
			pro.setEntityCountA06(entityCountA06);
			pro.setPropertyCountA02(propertyCountA02);
			pro.setPropertyCountA06(propertyCountA06);
			pro.setCapitalCountA02(capitalCountA02);
			pro.setCapitalCountA06(capitalCountA06);
			pro.setTodayEntityCountA02(todayEntityCountA02);
			pro.setTodayEntityCountA06(todayEntityCountA06);
			pro.setTodayPropertyCountA02(todayPropertyCountA02);
			pro.setTodayPropertyCountA06(todayPropertyCountA06);
			pro.setTodayCapitalCountA02(todayCapitalCountA02);
			pro.setTodayCapitalCountA06(todayCapitalCountA06);
			listPro.add(pro);
		}
		request.setAttribute("listPro", listPro);
		return "dataParse";
	}
	
	private String DataCount(String tradInstitutionId,String projectClassifyCode,String businessStatus,String type){
		CaaeProjectExample example = new CaaeProjectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andTradInstitutionIdEqualTo(tradInstitutionId);
		createCriteria.andProjectClassifyCodeEqualTo(projectClassifyCode);
		createCriteria.andBusinessStatusEqualTo(businessStatus);
		if("today".equals(type)){
			try {
				DateFormat df1 = DateFormat.getDateInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String str = df1.format(new Date());
				Date date = sdf.parse(str);
				createCriteria.andReportTimeGreaterThanOrEqualTo(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		int totalCount = caaeProjectService.countByExampleById(example);
		return String.valueOf(totalCount);
	}
}

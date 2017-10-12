package com.jmj.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.jmj.dao2.CaaeAddPub2Mapper;
import com.jmj.dao2.CaaeAppraisal2Mapper;
import com.jmj.dao2.CaaeAssess2Mapper;
import com.jmj.dao2.CaaeBidinfo2Mapper;
import com.jmj.dao2.CaaeBuyer2Mapper;
import com.jmj.dao2.CaaeFile2Mapper;
import com.jmj.dao2.CaaeFinance2Mapper;
import com.jmj.dao2.CaaeHolder2Mapper;
import com.jmj.dao2.CaaeNegoinfo2Mapper;
import com.jmj.dao2.CaaeObject2Mapper;
import com.jmj.dao2.CaaeOrg2Mapper;
import com.jmj.dao2.CaaeProject2Mapper;
import com.jmj.dao2.CaaeSeller2Mapper;
import com.jmj.dao2.CaaeSpecies2Mapper;
import com.jmj.dao2.CaaeTenderinfo2Mapper;
import com.jmj.dao2.CaaeTrade2Mapper;
import com.jmj.dao2.GqCaaeProject2Mapper;
import com.jmj.dao2.SwCaaeProject2Mapper;
import com.jmj.dao2.ZzCaaeProject2Mapper;
import com.jmj.entity.CaaeAddPub;
import com.jmj.entity.CaaeAppraisal;
import com.jmj.entity.CaaeAssess;
import com.jmj.entity.CaaeBidinfo;
import com.jmj.entity.CaaeBuyer;
import com.jmj.entity.CaaeFile;
import com.jmj.entity.CaaeFinance;
import com.jmj.entity.CaaeHolder;
import com.jmj.entity.CaaeNegoinfo;
import com.jmj.entity.CaaeObject;
import com.jmj.entity.CaaeProject;
import com.jmj.entity.CaaeProject2;
import com.jmj.entity.CaaeProject2Example;
import com.jmj.entity.CaaeSeller;
import com.jmj.entity.CaaeTenderinfo;
import com.jmj.entity.CaaeTrade;
import com.jmj.entity.GqCaaeProject;
import com.jmj.entity.SwCaaeProject;
import com.jmj.entity.ZzCaaeProject;
import com.jmj.entity2.CaaeAddPub2;
import com.jmj.entity2.CaaeAddPub2Example;
import com.jmj.entity2.CaaeAppraisal2;
import com.jmj.entity2.CaaeAppraisal2Example;
import com.jmj.entity2.CaaeAssess2;
import com.jmj.entity2.CaaeAssess2Example;
import com.jmj.entity2.CaaeBidinfo2;
import com.jmj.entity2.CaaeBidinfo2Example;
import com.jmj.entity2.CaaeBuyer2;
import com.jmj.entity2.CaaeBuyer2Example;
import com.jmj.entity2.CaaeFile2;
import com.jmj.entity2.CaaeFile2Example;
import com.jmj.entity2.CaaeFinance2;
import com.jmj.entity2.CaaeFinance2Example;
import com.jmj.entity2.CaaeHolder2;
import com.jmj.entity2.CaaeHolder2Example;
import com.jmj.entity2.CaaeNegoinfo2;
import com.jmj.entity2.CaaeNegoinfo2Example;
import com.jmj.entity2.CaaeObject2;
import com.jmj.entity2.CaaeObject2Example;
import com.jmj.entity2.CaaeSeller2;
import com.jmj.entity2.CaaeSeller2Example;
import com.jmj.entity2.CaaeTenderinfo2;
import com.jmj.entity2.CaaeTenderinfo2Example;
import com.jmj.entity2.CaaeTrade2;
import com.jmj.entity2.CaaeTrade2Example;
import com.jmj.entity2.GqCaaeProject2;
import com.jmj.entity2.GqCaaeProject2Example;
import com.jmj.entity2.SwCaaeProject2;
import com.jmj.entity2.SwCaaeProject2Example;
import com.jmj.entity2.ZzCaaeProject2;
import com.jmj.entity2.ZzCaaeProject2Example;
import com.jmj.inf.logger.IJMJLogger;
import com.jmj.inf.logger.JMJLogger;
import com.jmj.utils.TypeConvert;

@Service("insertService")
@Transactional
public class InsertService {
	IJMJLogger logger = JMJLogger.getLogger(InsertService.class);
	@Resource
	private CaaeProject2Mapper project2Dao;
	@Resource
	private CaaeAddPub2Mapper addPub2Dao;
	@Resource
	private CaaeAppraisal2Mapper appraisal2Dao;
	@Resource
	private CaaeAssess2Mapper assess2Dao;
	@Resource
	private CaaeBidinfo2Mapper bidinfo2Dao;
	@Resource
	private CaaeBuyer2Mapper buyer2Dao;
	@Resource
	private CaaeFile2Mapper file2Dao;
	@Resource
	private CaaeFinance2Mapper finance2Dao;
	@Resource
	private CaaeHolder2Mapper holder2Dao;
	@Resource
	private CaaeNegoinfo2Mapper negoinfo2Dao;
	@Resource
	private CaaeObject2Mapper object2Dao;
	@Resource
	private CaaeOrg2Mapper org2Dao;
	@Resource
	private CaaeSeller2Mapper seller2Dao;
	@Resource
	private CaaeSpecies2Mapper species2Dao;
	@Resource
	private CaaeTenderinfo2Mapper tenderinfo2Dao;
	@Resource
	private CaaeTrade2Mapper trade2Dao;
	@Resource
	private GqCaaeProject2Mapper gcProject2Dao;
	@Resource
	private SwCaaeProject2Mapper scProject2Dao;
	@Resource
	private ZzCaaeProject2Mapper zzProject2Dao;

	@Transactional("transactionManager2")
	@SuppressWarnings("unchecked")
	/**
	 * 
	 * @Description:insert（将数据放入业务库
	 * @param map
	 * @return
	 * String
	 */
	public String insert(Map<String, Object> map) {
		String result = "T";
		try {
			CaaeProject2 project2 = (CaaeProject2) map.get("project2");
			logger.info(
					"审核人:" + project2.getAuditUser(),
					"proTransId:" + project2.getProTransId(),
					"审核时间:"
							+ TypeConvert.dateToString(new Date(),
									"yyyy-MM-dd HH:mm:ss"));
			project2Dao.insertSelective(project2);
			List<CaaeAddPub> addPubList = (List<CaaeAddPub>) map.get("addPub");
			if (addPubList != null) {
				for (CaaeAddPub addPub : addPubList) {
					CaaeAddPub2 addPub2 = JSONObject.parseObject(
							JSONObject.toJSONString(addPub), CaaeAddPub2.class);
					addPub2Dao.insertSelective(addPub2);
				}
			}
			List<CaaeAppraisal> appraisalList = (List<CaaeAppraisal>) map
					.get("appraisal");
			if (appraisalList != null) {
				for (CaaeAppraisal appraisal : appraisalList) {
					CaaeAppraisal2 appraisal2 = JSONObject.parseObject(
							JSONObject.toJSONString(appraisal),
							CaaeAppraisal2.class);
					appraisal2Dao.insertSelective(appraisal2);
				}
			}
			List<CaaeAssess> assessList = (List<CaaeAssess>) map.get("assess");
			if (assessList != null) {
				for (CaaeAssess assess : assessList) {
					System.out.println(JSONObject.toJSONString(assess));
					CaaeAssess2 assess2 = JSONObject.parseObject(
							JSONObject.toJSONString(assess), CaaeAssess2.class);
					assess2Dao.insertSelective(assess2);
				}
			}
			List<CaaeBidinfo> bidinfoList = (List<CaaeBidinfo>) map
					.get("bidinfo");
			if (bidinfoList != null) {
				for (CaaeBidinfo bidinfo : bidinfoList) {
					CaaeBidinfo2 bidinfo2 = JSONObject.parseObject(
							JSONObject.toJSONString(bidinfo),
							CaaeBidinfo2.class);
					bidinfo2Dao.insertSelective(bidinfo2);
				}
			}
			List<CaaeBuyer> buyerList = (List<CaaeBuyer>) map.get("buyer");
			if (buyerList != null) {
				for (CaaeBuyer buyer : buyerList) {
					CaaeBuyer2 buyer2 = JSONObject.parseObject(
							JSONObject.toJSONString(buyer), CaaeBuyer2.class);
					buyer2Dao.insertSelective(buyer2);
				}
			}
			List<CaaeFile> fileList = (List<CaaeFile>) map.get("file");
			if (fileList != null) {
				for (CaaeFile file : fileList) {
					CaaeFile2 file2 = JSONObject.parseObject(
							JSONObject.toJSONString(file), CaaeFile2.class);
					file2Dao.insertSelective(file2);
				}
			}
			List<CaaeFinance> financeList = (List<CaaeFinance>) map
					.get("finance");
			if (financeList != null) {
				for (CaaeFinance finance : financeList) {
					CaaeFinance2 finance2 = JSONObject.parseObject(
							JSONObject.toJSONString(finance),
							CaaeFinance2.class);
					finance2Dao.insertSelective(finance2);
				}
			}
			List<CaaeHolder> holderList = (List<CaaeHolder>) map.get("holder");
			if (holderList != null) {
				for (CaaeHolder holder : holderList) {
					CaaeHolder2 holder2 = JSONObject.parseObject(
							JSONObject.toJSONString(holder), CaaeHolder2.class);
					holder2Dao.insertSelective(holder2);
				}
			}
			List<CaaeNegoinfo> negoinfoList = (List<CaaeNegoinfo>) map
					.get("negoinfo");
			if (negoinfoList != null) {
				for (CaaeNegoinfo negoinfo : negoinfoList) {
					CaaeNegoinfo2 negoinfo2 = JSONObject.parseObject(
							JSONObject.toJSONString(negoinfo),
							CaaeNegoinfo2.class);
					negoinfo2Dao.insertSelective(negoinfo2);
				}
			}
			List<CaaeObject> objectList = (List<CaaeObject>) map.get("object");
			if (objectList != null) {
				for (CaaeObject object : objectList) {
					CaaeObject2 object2 = JSONObject.parseObject(
							JSONObject.toJSONString(object), CaaeObject2.class);
					object2Dao.insertSelective(object2);
				}
			}
			List<CaaeSeller> sellerList = (List<CaaeSeller>) map.get("seller");
			if (sellerList != null) {
				for (CaaeSeller seller : sellerList) {
					CaaeSeller2 seller2 = JSONObject.parseObject(
							JSONObject.toJSONString(seller), CaaeSeller2.class);
					seller2Dao.insertSelective(seller2);
				}
			}
			List<CaaeTenderinfo> tenderinfoList = (List<CaaeTenderinfo>) map
					.get("tenderinfo");
			if (tenderinfoList != null) {
				for (CaaeTenderinfo tenderinfo : tenderinfoList) {
					CaaeTenderinfo2 tenderinfo2 = JSONObject.parseObject(
							JSONObject.toJSONString(tenderinfo),
							CaaeTenderinfo2.class);
					tenderinfo2Dao.insertSelective(tenderinfo2);
				}
			}
			List<CaaeTrade> tradeList = (List<CaaeTrade>) map.get("trade");
			if (tradeList != null) {
				for (CaaeTrade trade : tradeList) {
					CaaeTrade2 trade2 = JSONObject.parseObject(
							JSONObject.toJSONString(trade), CaaeTrade2.class);
					trade2Dao.insertSelective(trade2);
				}
			}
			List<GqCaaeProject> gcProjectList = (List<GqCaaeProject>) map
					.get("gcProject");
			if (gcProjectList != null) {
				for (GqCaaeProject gcProject : gcProjectList) {
					GqCaaeProject2 gcProject2 = JSONObject.parseObject(
							JSONObject.toJSONString(gcProject),
							GqCaaeProject2.class);
					gcProject2Dao.insertSelective(gcProject2);
				}
			}
			List<SwCaaeProject> scProjectList = (List<SwCaaeProject>) map
					.get("scProject");
			if (scProjectList != null) {
				for (SwCaaeProject scProject : scProjectList) {
					SwCaaeProject2 scProject2 = JSONObject.parseObject(
							JSONObject.toJSONString(scProject),
							SwCaaeProject2.class);
					scProject2Dao.insertSelective(scProject2);
				}
			}
			//增资扩股
			List<ZzCaaeProject> zzProjectList = (List<ZzCaaeProject>) map
					.get("zzProject");
			if (zzProjectList != null) {
				for (ZzCaaeProject zzProject : zzProjectList) {
					ZzCaaeProject2 zzProject2 = JSONObject.parseObject(JSONObject.toJSONString(zzProject),
							ZzCaaeProject2.class);
					zzProject2Dao.insertSelective(zzProject2);
				}
			}
		} catch (Exception e) {
			logger.error(
					"保存到业务数据库失败",
					TypeConvert.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss"),
					e);
			result = "F";
			throw new RuntimeException();
		}
		return result;
	}

	@Transactional("transactionManager2")
	/**
	 * 
	 * @Description:deleteAndInsert(删除在业务库中已存在的重复数据
	 * @param map
	 * @param project2List
	 * @return
	 * String
	 */
	public String deleteAndInsert(Map<String, Object> map,
			List<CaaeProject2> project2List) {
		String result = "T";
		try {
			String proTransId = project2List.get(0).getProTransId();
			CaaeAddPub2Example caaeAddPubExample = new CaaeAddPub2Example();
			caaeAddPubExample.createCriteria().andProTransIdEqualTo(proTransId);
			addPub2Dao.deleteByExample(caaeAddPubExample);

			CaaeAppraisal2Example caaeAppraisalExample = new CaaeAppraisal2Example();
			caaeAppraisalExample.createCriteria().andProTransIdEqualTo(
					proTransId);
			appraisal2Dao.deleteByExample(caaeAppraisalExample);

			CaaeAssess2Example caaeAssessExample = new CaaeAssess2Example();
			caaeAssessExample.createCriteria().andProTransIdEqualTo(proTransId);
			assess2Dao.deleteByExample(caaeAssessExample);

			CaaeBidinfo2Example caaeBidinfoExample = new CaaeBidinfo2Example();
			caaeBidinfoExample.createCriteria()
					.andProTransIdEqualTo(proTransId);
			bidinfo2Dao.deleteByExample(caaeBidinfoExample);

			CaaeBuyer2Example caaeBuyerExample = new CaaeBuyer2Example();
			caaeBuyerExample.createCriteria().andProTransIdEqualTo(proTransId);
			buyer2Dao.deleteByExample(caaeBuyerExample);

			CaaeFile2Example caaeFileExample = new CaaeFile2Example();
			caaeFileExample.createCriteria().andProTransIdEqualTo(proTransId);
			file2Dao.deleteByExample(caaeFileExample);

			CaaeFinance2Example caaeFinanceExample = new CaaeFinance2Example();
			caaeFinanceExample.createCriteria()
					.andProTransIdEqualTo(proTransId);
			finance2Dao.deleteByExample(caaeFinanceExample);

			CaaeHolder2Example caaeHolderExample = new CaaeHolder2Example();
			caaeHolderExample.createCriteria().andProTransIdEqualTo(proTransId);
			holder2Dao.deleteByExample(caaeHolderExample);

			CaaeNegoinfo2Example caaeNegoinfoExample = new CaaeNegoinfo2Example();
			caaeNegoinfoExample.createCriteria().andProTransIdEqualTo(
					proTransId);
			negoinfo2Dao.deleteByExample(caaeNegoinfoExample);

			CaaeObject2Example caaeObjectExample = new CaaeObject2Example();
			caaeObjectExample.createCriteria().andProTransIdEqualTo(proTransId);
			object2Dao.deleteByExample(caaeObjectExample);

			CaaeSeller2Example caaeSellerExample = new CaaeSeller2Example();
			caaeSellerExample.createCriteria().andProTransIdEqualTo(proTransId);
			seller2Dao.deleteByExample(caaeSellerExample);

			CaaeTenderinfo2Example caaeTenderinfoExample = new CaaeTenderinfo2Example();
			caaeTenderinfoExample.createCriteria().andProTransIdEqualTo(
					proTransId);
			tenderinfo2Dao.deleteByExample(caaeTenderinfoExample);

			CaaeTrade2Example caaeTradeExample = new CaaeTrade2Example();
			caaeTradeExample.createCriteria().andProTransIdEqualTo(proTransId);
			trade2Dao.deleteByExample(caaeTradeExample);

			GqCaaeProject2Example gqCaaeProjectExample = new GqCaaeProject2Example();
			gqCaaeProjectExample.createCriteria().andProTransIdEqualTo(
					proTransId);
			gcProject2Dao.deleteByExample(gqCaaeProjectExample);

			SwCaaeProject2Example swCaaeProjectExample = new SwCaaeProject2Example();
			swCaaeProjectExample.createCriteria().andProTransIdEqualTo(
					proTransId);
			scProject2Dao.deleteByExample(swCaaeProjectExample);

			ZzCaaeProject2Example zzCaaeProject2Example = new ZzCaaeProject2Example();
			zzCaaeProject2Example.createCriteria().andProTransIdEqualTo(proTransId);
			zzProject2Dao.deleteByExample(zzCaaeProject2Example);
			
			CaaeProject2Example caaeProject2Example = new CaaeProject2Example();
			caaeProject2Example.createCriteria().andProTransIdEqualTo(
					proTransId);
			project2Dao.deleteByExample(caaeProject2Example);

			this.insert(map);
		} catch (Exception e) {
			logger.error(
					"先删除后保存到业务数据库失败",
					TypeConvert.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss"),
					e);
			result = "F";
			throw new RuntimeException();
		}
		return result;
	}
}

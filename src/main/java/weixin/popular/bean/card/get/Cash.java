package weixin.popular.bean.card.get;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * 代金券
 * 
 * @author Moyq5
 *
 */
public class Cash extends weixin.popular.bean.card.create.Cash {
	
	/**
	 * 基本信息
	 */
	@JSONField(name = "base_info")
	private BaseInfo baseInfo;

	/**
	 * 高级信息
	 */
	@JSONField(name = "advanced_info")
	private AdvancedInfo advancedInfo;

	public BaseInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(BaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public AdvancedInfo getAdvancedInfo() {
		return advancedInfo;
	}

	public void setAdvancedInfo(AdvancedInfo advancedInfo) {
		this.advancedInfo = advancedInfo;
	}

}

package weixin.popular.bean.card.get;


/**
 * 团购券
 * 
 * @author Moyq5
 *
 */
public class GrouponCard extends weixin.popular.bean.card.create.CreateGroupon {

	private Groupon groupon;

	public Groupon getGroupon() {
		return groupon;
	}

	public void setGroupon(Groupon groupon) {
		this.groupon = groupon;
	}

}

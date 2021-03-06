package weixin.popular.bean.card.get;

import weixin.popular.bean.BaseResult;
import weixin.popular.bean.card.create.AbstractCardCreate;

/**
 * 
 * @author Moyq5
 *
 * @param <T>可以是CardCash、CardDiscount、CardGeneralCoupon、CardGift、CardGroupon
 */
public class GetResult<T extends AbstractCardCreate> extends BaseResult {

	private T card;

	public T getCard() {
		return card;
	}

	public void setCard(T card) {
		this.card = card;
	}
}
package com.github.listen_to_me.domain.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TransactionPageQuery extends PageQuery {
    /**
     * 交易类型筛选
     * 枚举值:EXPENSE／INCOME
     */
    private String type;

    /**
     * 业务类型筛选，
     * 枚举值:AUDIO／CONSULT／RECHARGE／REFUND
     */
    private String bizType;
}

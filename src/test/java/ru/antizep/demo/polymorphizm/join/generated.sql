select billingdet0_.id                                 as id1_9_,
       billingdet0_.owner                              as owner2_9_,
       billingdet0_1_.account                          as account1_8_,
       billingdet0_1_.bank_name                        as bank_nam2_8_,
       billingdet0_2_.card_number                      as card_num1_10_,
       billingdet0_2_.exp_month                        as exp_mont2_10_,
       billingdet0_2_.exp_year                         as exp_year3_10_,
       case
           when billingdet0_1_.id is not null then 1
           when billingdet0_2_.id is not null then 2
           when billingdet0_.id is not null then 0 end as clazz_
from join_billing_detail billingdet0_
         left outer join join_bank_account billingdet0_1_ on billingdet0_.id = billingdet0_1_.id
         left outer join join_credit_card billingdet0_2_ on billingdet0_.id = billingdet0_2_.id
select billingdet0_.id          as id1_3_,
       billingdet0_.owner       as owner2_3_,
       billingdet0_.account     as account1_4_,
       billingdet0_.bank_name   as bank_nam2_4_,
       billingdet0_.card_number as card_num1_5_,
       billingdet0_.exp_month   as exp_mont2_5_,
       billingdet0_.exp_year    as exp_year3_5_,
       billingdet0_.clazz_      as clazz_
from (select id, owner, account, bank_name, null::varchar as card_number, null::varchar as exp_month, null::varchar as exp_year, 1 as clazz_ from cbank_account union all
select id, owner, null::varchar as account, null::varchar as bank_name, card_number, exp_month, exp_year, 2 as clazz_
from ccredit_card ) billingdet0_
where billingdet0_.id=1
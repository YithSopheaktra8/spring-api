package co.istad.springapi.api.accounttype;

import org.apache.ibatis.jdbc.SQL;

public class AccountTypeProvider {
    public String buildSelectSql(){
        return new SQL(){{
            // TODO:
            SELECT("*");
            FROM("account_types");
        }}.toString();
    }
}

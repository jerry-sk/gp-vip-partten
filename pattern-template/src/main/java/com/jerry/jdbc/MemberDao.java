package com.jerry.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 12:02
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<Member> executeQuery() throws Exception {
        String sql =  "select * form member where name = ？";
        return (List<Member>) this.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setId(rs.getInt("ID"));
                member.setAge(rs.getInt("AGE"));
                member.setName(rs.getString("NAME"));
                return  member;
            }
        },new Object[]{"jerry"});

    }
}

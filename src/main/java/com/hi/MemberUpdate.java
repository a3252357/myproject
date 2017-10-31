package com.hi;

import com.util.FieldData;
import com.util.Util;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.jdbc.core.SqlProvider;

import java.util.ArrayList;
import java.util.Map;

public class MemberUpdate {

    public SQL updatebyid(final Member data) {
        return new SQL() {
            {

                UPDATE(Util.GetTableName(data.getClass()));
                Map<String, Object> fieldData = null;
                try {
                    fieldData = Util.getModelValue(data.getClass());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (String key : fieldData.keySet()) {
                    if (!fieldData.get(key).equals(null)) {
                        SET(key + " = #{" + key + "}");
                    }
                }
                WHERE("id = #{id}");

            }
        };
    }
}



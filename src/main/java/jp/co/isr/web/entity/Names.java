package jp.co.isr.web.entity;

import javax.annotation.Generated;
import jp.co.isr.web.entity.AttendanceNames._AttendanceNames;
import jp.co.isr.web.entity.MUserNames._MUserNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2012/12/17 0:50:29")
public class Names {

    /**
     * {@link Attendance}の名前クラスを返します。
     * 
     * @return Attendanceの名前クラス
     */
    public static _AttendanceNames attendance() {
        return new _AttendanceNames();
    }

    /**
     * {@link MUser}の名前クラスを返します。
     * 
     * @return MUserの名前クラス
     */
    public static _MUserNames mUser() {
        return new _MUserNames();
    }
}
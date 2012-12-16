package jp.co.isr.web.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

/**
 * Attendanceエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/12/17 0:50:26")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer id;

    /** goingTimeプロパティ */
    @Column(nullable = true, unique = false)
    public Date goingTime;

    /** leavingTimeプロパティ */
    @Column(nullable = true, unique = false)
    public Date leavingTime;

    /** restHoursプロパティ */
    @Column(precision = 12, nullable = true, unique = false)
    public Float restHours;

    /** workContentsプロパティ */
    @Column(length = 128, nullable = true, unique = false)
    public String workContents;

    /** commentプロパティ */
    @Column(length = 128, nullable = true, unique = false)
    public String comment;

    /** createdDateプロパティ */
    @Column(nullable = true, unique = false)
    public Date createdDate;

    /** createdUserプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer createdUser;

    /** updateDateプロパティ */
    @Column(nullable = true, unique = false)
    public Date updateDate;

    /** updateUserプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer updateUser;

    /** versionプロパティ */
    @Version
    @Column(precision = 10, nullable = true, unique = false)
    public Integer version;
}
package jp.co.isr.web.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

/**
 * MUserエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/12/17 0:50:26")
public class MUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer id;

    /** firstNameプロパティ */
    @Column(length = 32, nullable = true, unique = false)
    public String firstName;

    /** lastNameプロパティ */
    @Column(length = 32, nullable = true, unique = false)
    public String lastName;

    /** userIdプロパティ */
    @Column(length = 32, nullable = true, unique = false)
    public String userId;

    /** passwordプロパティ */
    @Column(length = 128, nullable = true, unique = false)
    public String password;

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
package jp.co.isr.web.entity;

import java.sql.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MUser}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/12/17 0:50:29")
public class MUserNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * firstNameのプロパティ名を返します。
     * 
     * @return firstNameのプロパティ名
     */
    public static PropertyName<String> firstName() {
        return new PropertyName<String>("firstName");
    }

    /**
     * lastNameのプロパティ名を返します。
     * 
     * @return lastNameのプロパティ名
     */
    public static PropertyName<String> lastName() {
        return new PropertyName<String>("lastName");
    }

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<String> userId() {
        return new PropertyName<String>("userId");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * createdDateのプロパティ名を返します。
     * 
     * @return createdDateのプロパティ名
     */
    public static PropertyName<Date> createdDate() {
        return new PropertyName<Date>("createdDate");
    }

    /**
     * createdUserのプロパティ名を返します。
     * 
     * @return createdUserのプロパティ名
     */
    public static PropertyName<Integer> createdUser() {
        return new PropertyName<Integer>("createdUser");
    }

    /**
     * updateDateのプロパティ名を返します。
     * 
     * @return updateDateのプロパティ名
     */
    public static PropertyName<Date> updateDate() {
        return new PropertyName<Date>("updateDate");
    }

    /**
     * updateUserのプロパティ名を返します。
     * 
     * @return updateUserのプロパティ名
     */
    public static PropertyName<Integer> updateUser() {
        return new PropertyName<Integer>("updateUser");
    }

    /**
     * versionのプロパティ名を返します。
     * 
     * @return versionのプロパティ名
     */
    public static PropertyName<Integer> version() {
        return new PropertyName<Integer>("version");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MUserNames extends PropertyName<MUser> {

        /**
         * インスタンスを構築します。
         */
        public _MUserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MUserNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _MUserNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * firstNameのプロパティ名を返します。
         *
         * @return firstNameのプロパティ名
         */
        public PropertyName<String> firstName() {
            return new PropertyName<String>(this, "firstName");
        }

        /**
         * lastNameのプロパティ名を返します。
         *
         * @return lastNameのプロパティ名
         */
        public PropertyName<String> lastName() {
            return new PropertyName<String>(this, "lastName");
        }

        /**
         * userIdのプロパティ名を返します。
         *
         * @return userIdのプロパティ名
         */
        public PropertyName<String> userId() {
            return new PropertyName<String>(this, "userId");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * createdDateのプロパティ名を返します。
         *
         * @return createdDateのプロパティ名
         */
        public PropertyName<Date> createdDate() {
            return new PropertyName<Date>(this, "createdDate");
        }

        /**
         * createdUserのプロパティ名を返します。
         *
         * @return createdUserのプロパティ名
         */
        public PropertyName<Integer> createdUser() {
            return new PropertyName<Integer>(this, "createdUser");
        }

        /**
         * updateDateのプロパティ名を返します。
         *
         * @return updateDateのプロパティ名
         */
        public PropertyName<Date> updateDate() {
            return new PropertyName<Date>(this, "updateDate");
        }

        /**
         * updateUserのプロパティ名を返します。
         *
         * @return updateUserのプロパティ名
         */
        public PropertyName<Integer> updateUser() {
            return new PropertyName<Integer>(this, "updateUser");
        }

        /**
         * versionのプロパティ名を返します。
         *
         * @return versionのプロパティ名
         */
        public PropertyName<Integer> version() {
            return new PropertyName<Integer>(this, "version");
        }
    }
}
package jp.co.isr.web.entity;

import java.sql.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Attendance}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/12/17 0:50:29")
public class AttendanceNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * goingTimeのプロパティ名を返します。
     * 
     * @return goingTimeのプロパティ名
     */
    public static PropertyName<Date> goingTime() {
        return new PropertyName<Date>("goingTime");
    }

    /**
     * leavingTimeのプロパティ名を返します。
     * 
     * @return leavingTimeのプロパティ名
     */
    public static PropertyName<Date> leavingTime() {
        return new PropertyName<Date>("leavingTime");
    }

    /**
     * restHoursのプロパティ名を返します。
     * 
     * @return restHoursのプロパティ名
     */
    public static PropertyName<Float> restHours() {
        return new PropertyName<Float>("restHours");
    }

    /**
     * workContentsのプロパティ名を返します。
     * 
     * @return workContentsのプロパティ名
     */
    public static PropertyName<String> workContents() {
        return new PropertyName<String>("workContents");
    }

    /**
     * commentのプロパティ名を返します。
     * 
     * @return commentのプロパティ名
     */
    public static PropertyName<String> comment() {
        return new PropertyName<String>("comment");
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
    public static class _AttendanceNames extends PropertyName<Attendance> {

        /**
         * インスタンスを構築します。
         */
        public _AttendanceNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _AttendanceNames(final String name) {
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
        public _AttendanceNames(final PropertyName<?> parent, final String name) {
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
         * goingTimeのプロパティ名を返します。
         *
         * @return goingTimeのプロパティ名
         */
        public PropertyName<Date> goingTime() {
            return new PropertyName<Date>(this, "goingTime");
        }

        /**
         * leavingTimeのプロパティ名を返します。
         *
         * @return leavingTimeのプロパティ名
         */
        public PropertyName<Date> leavingTime() {
            return new PropertyName<Date>(this, "leavingTime");
        }

        /**
         * restHoursのプロパティ名を返します。
         *
         * @return restHoursのプロパティ名
         */
        public PropertyName<Float> restHours() {
            return new PropertyName<Float>(this, "restHours");
        }

        /**
         * workContentsのプロパティ名を返します。
         *
         * @return workContentsのプロパティ名
         */
        public PropertyName<String> workContents() {
            return new PropertyName<String>(this, "workContents");
        }

        /**
         * commentのプロパティ名を返します。
         *
         * @return commentのプロパティ名
         */
        public PropertyName<String> comment() {
            return new PropertyName<String>(this, "comment");
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
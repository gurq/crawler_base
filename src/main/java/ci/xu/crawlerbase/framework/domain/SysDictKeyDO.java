package ci.xu.crawlerbase.framework.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author:ShadowSaint
 * @Date:19-4-6 下午12:41
 * @Description: TODO
 */
@Entity
@Table(name = "t_sys_dict_key")
@Data
public class SysDictKeyDO extends BaseDomain {
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private int sort;
    @Column
    private String property1Name;
    @Column
    private String property2Name;
    @Column
    private String property3Name;
}
package ci.xu.crawlerbase.framework.domain;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author:ShadowSaint
 * @Date:19-4-3 上午4:56
 * @Description: TODO
 */
@MappedSuperclass
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseDomain {
    @Id
    @GenericGenerator(
            name = "uuid2",
            strategy = "uuid2",
            parameters = {@org.hibernate.annotations.Parameter(
                    name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")
            })
    @GeneratedValue(generator = "uuid2")
    private String id;
    @Column
    private LocalDateTime gmtCreate;
    @Column
    private LocalDateTime gmtModified;

    public void initInsert() {
        this.gmtCreate = LocalDateTime.now();
        this.gmtModified = LocalDateTime.now();
    }

    public void initUpdate() {
        this.gmtModified = LocalDateTime.now();
    }
}
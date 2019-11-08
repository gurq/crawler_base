package ci.xu.crawlerbase.biz.domain.entity.domain;

import ci.xu.crawlerbase.framework.domain.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "domain")
@Data
public class DomainDO extends BaseDomain {
    @Column
    private String domain;
    @Column
    private String suffix;
}

package ci.xu.crawlerbase.biz.domain.controller;

import ci.xu.crawlerbase.biz.domain.entity.domain.DomainDO;
import ci.xu.crawlerbase.biz.domain.repository.DomainRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domain")
@Api
public class DomainController {

    @Autowired
    DomainRepository domainRepository;

    @GetMapping("/")
    @ApiOperation("域名爬虫主页")
    public void index(){
        DomainDO domainDO = new DomainDO();
        domainDO.initInsert();
//        domainRepository.saveAndFlush(domainDO);
    }

}

# shop-samsam
3조 삼삼한 안경 쇼핑몰


# 👓안경 쇼핑몰 창고 관리 프로그램👓

## 프로젝트 소개
* 개발기간 : 2024.06.25 - 2024.05.28 (4일)
* 본사와 안경점 사장님 사이에 일어나는 제품 재고 관리를 도와주는 프로그램

*
##  팀원 구성
1. 서윤정 (yj0318)
2. 석현균 (gusrbstjr)
3. 이창연 (cylcoder)
4. 장윤지 (eliaaa)
5. 이정훈 (leejeonghun99)

##  개발 환경
* Develop : IntelliJ IDEA 2024.1.1 (Ultimate Edition)
* JAVA JDK: Temurin version '17.0.10'
* MySQL-connector-j : 8.0.33
* Mybatis : 3.5.6
* Version Control : Git


## 프로젝트 구조
폴더 PATH의 목록입니다.
볼륨 일련 번호는 F86F-7BAD입니다.
C:.
├─main
│  ├─java
│  │  └─com
│  │      └─ohgiraffers
│  │          └─samsam
│  │              │  SamsamApplication.java
│  │              │  
│  │              ├─board
│  │              │  ├─controller
│  │              │  │      QnAController.java
│  │              │  │      
│  │              │  ├─model
│  │              │  │  ├─dao
│  │              │  │  │      QnAMapper.java
│  │              │  │  │      
│  │              │  │  ├─dto
│  │              │  │  │      BoardDTO.java
│  │              │  │  │      
│  │              │  │  └─service
│  │              │  │          QnAService.java
│  │              │  │          QnAServiceImpl.java
│  │              │  │          
│  │              │  └─notice
│  │              │          Board.java
│  │              │          NoticeController.java
│  │              │          NoticeMapper.java
│  │              │          NoticeService.java
│  │              │          
│  │              ├─common
│  │              │  ├─exception
│  │              │  │      OrderException.java
│  │              │  │      WareHouseException.java
│  │              │  │      
│  │              │  ├─mybatis
│  │              │  │      MybatisConfiguration.java
│  │              │  │      
│  │              │  └─paging
│  │              │          Pagenation.java
│  │              │          
│  │              ├─login
│  │              │  ├─controller
│  │              │  │      loginController.java
│  │              │  │      
│  │              │  └─model
│  │              │      ├─dao
│  │              │      │      loginMapper.java
│  │              │      │      
│  │              │      ├─dto
│  │              │      │      accountDTO.java
│  │              │      │      
│  │              │      └─service
│  │              │              loginService.java
│  │              │              loginServiceImpl.java
│  │              │              
│  │              ├─mail
│  │              │      MailConfig.java
│  │              │      MailController.java
│  │              │      MailMapper.java
│  │              │      MailRequest.java
│  │              │      MailService.java
│  │              │      
│  │              ├─main
│  │              │  ├─controller
│  │              │  │      MainController.java
│  │              │  │      
│  │              │  └─model
│  │              │      ├─dao
│  │              │      │      SaleMapper.java
│  │              │      │      
│  │              │      ├─dto
│  │              │      │      SaleDTO.java
│  │              │      │      
│  │              │      └─service
│  │              │              SaleImpl.java
│  │              │              SaleService.java
│  │              │              
│  │              ├─member
│  │              │      Member.java
│  │              │      MemberController.java
│  │              │      MemberMapper.java
│  │              │      MemberService.java
│  │              │      
│  │              ├─order
│  │              │  ├─controller
│  │              │  │      OrderChangeController.java
│  │              │  │      OrderFindController.java
│  │              │  │      
│  │              │  └─model
│  │              │      ├─dao
│  │              │      │      OrderChangeMapper.java
│  │              │      │      OrderFindMapper.java
│  │              │      │      
│  │              │      ├─dto
│  │              │      │      OrderChangeDTO.java
│  │              │      │      OrderFindDTO.java
│  │              │      │      
│  │              │      └─service
│  │              │              OrderChangeImpl.java
│  │              │              OrderChangeService.java
│  │              │              OrderFindService.java
│  │              │              OrderFindServiceImpl.java
│  │              │              
│  │              ├─shoppingmall
│  │              │  ├─product
│  │              │  │  ├─controller
│  │              │  │  │      ProductController.java
│  │              │  │  │      
│  │              │  │  └─model
│  │              │  │      ├─dao
│  │              │  │      │      ProductMapper.java
│  │              │  │      │      
│  │              │  │      ├─dto
│  │              │  │      │      ProductDTO.java
│  │              │  │      │      
│  │              │  │      └─service
│  │              │  │              ProductService.java
│  │              │  │              ProductServiceImpl.java
│  │              │  │              
│  │              │  └─userinterface
│  │              │          InterfaceController.java
│  │              │          
│  │              └─warehouse
│  │                  ├─controller
│  │                  │      StockController.java
│  │                  │      WareHouseController.java
│  │                  │      
│  │                  └─model
│  │                      ├─dao
│  │                      │      WareHouseMapper.java
│  │                      │      
│  │                      ├─dto
│  │                      │      logDTO.java
│  │                      │      productDTO.java
│  │                      │      WareHouseDTO.java
│  │                      │      WareHouseLogDTO.java
│  │                      │      
│  │                      └─service
│  │                              WareHouseService.java
│  │                              WareHouseServiceImpl.java
│  │                              
│  └─resources
│      │  application.yml
│      │  logback.xml
│      │  schema.sql
│      │  
│      ├─mappers
│      │      loginMapper.xml
│      │      MailMapper.xml
│      │      MemberMapper.xml
│      │      NoticeMapper.xml
│      │      OrderChangeMapper.xml
│      │      OrderFindMapper.xml
│      │      ProductMapper.xml
│      │      QnAMapper.xml
│      │      SaleMapper.xml
│      │      Stock2Mapper.xml
│      │      StockMapper.xml
│      │      WareHouseMapper.xml
│      │      
│      ├─static
│      │  │  customer-main.html
│      │  │  
│      │  ├─bootstrap
│      │  │  └─assets
│      │  │      ├─css
│      │  │      │      style.css
│      │  │      │      
│      │  │      ├─img
│      │  │      │      apple-touch-icon.png
│      │  │      │      card.jpg
│      │  │      │      favicon.png
│      │  │      │      logo.png
│      │  │      │      messages-1.jpg
│      │  │      │      messages-2.jpg
│      │  │      │      messages-3.jpg
│      │  │      │      news-1.jpg
│      │  │      │      news-2.jpg
│      │  │      │      news-3.jpg
│      │  │      │      news-4.jpg
│      │  │      │      news-5.jpg
│      │  │      │      not-found.svg
│      │  │      │      product-1.jpg
│      │  │      │      product-2.jpg
│      │  │      │      product-3.jpg
│      │  │      │      product-4.jpg
│      │  │      │      product-5.jpg
│      │  │      │      profile-img.jpg
│      │  │      │      slides-1.jpg
│      │  │      │      slides-2.jpg
│      │  │      │      slides-3.jpg
│      │  │      │      
│      │  │      ├─js
│      │  │      │      main.js
│      │  │      │      
│      │  │      ├─scss
│      │  │      │      Readme.txt
│      │  │      │      
│      │  │      └─vendor
│      │  │          ├─apexcharts
│      │  │          │  │  apexcharts.amd.js
│      │  │          │  │  apexcharts.common.js
│      │  │          │  │  apexcharts.css
│      │  │          │  │  apexcharts.esm.js
│      │  │          │  │  apexcharts.js
│      │  │          │  │  apexcharts.min.js
│      │  │          │  │  
│      │  │          │  └─locales
│      │  │          │          ar.json
│      │  │          │          be-cyrl.json
│      │  │          │          be-latn.json
│      │  │          │          ca.json
│      │  │          │          cs.json
│      │  │          │          da.json
│      │  │          │          de.json
│      │  │          │          el.json
│      │  │          │          en.json
│      │  │          │          es.json
│      │  │          │          et.json
│      │  │          │          fa.json
│      │  │          │          fi.json
│      │  │          │          fr.json
│      │  │          │          he.json
│      │  │          │          hi.json
│      │  │          │          hr.json
│      │  │          │          hu.json
│      │  │          │          hy.json
│      │  │          │          id.json
│      │  │          │          it.json
│      │  │          │          ja.json
│      │  │          │          ka.json
│      │  │          │          ko.json
│      │  │          │          lt.json
│      │  │          │          lv.json
│      │  │          │          ms.json
│      │  │          │          nb.json
│      │  │          │          nl.json
│      │  │          │          pl.json
│      │  │          │          pt-br.json
│      │  │          │          pt.json
│      │  │          │          rs.json
│      │  │          │          ru.json
│      │  │          │          se.json
│      │  │          │          sk.json
│      │  │          │          sl.json
│      │  │          │          sq.json
│      │  │          │          th.json
│      │  │          │          tr.json
│      │  │          │          ua.json
│      │  │          │          vi.json
│      │  │          │          zh-cn.json
│      │  │          │          zh-tw.json
│      │  │          │          
│      │  │          ├─bootstrap
│      │  │          │  ├─css
│      │  │          │  │      bootstrap-grid.css
│      │  │          │  │      bootstrap-grid.css.map
│      │  │          │  │      bootstrap-grid.min.css
│      │  │          │  │      bootstrap-grid.min.css.map
│      │  │          │  │      bootstrap-grid.rtl.css
│      │  │          │  │      bootstrap-grid.rtl.css.map
│      │  │          │  │      bootstrap-grid.rtl.min.css
│      │  │          │  │      bootstrap-grid.rtl.min.css.map
│      │  │          │  │      bootstrap-reboot.css
│      │  │          │  │      bootstrap-reboot.css.map
│      │  │          │  │      bootstrap-reboot.min.css
│      │  │          │  │      bootstrap-reboot.min.css.map
│      │  │          │  │      bootstrap-reboot.rtl.css
│      │  │          │  │      bootstrap-reboot.rtl.css.map
│      │  │          │  │      bootstrap-reboot.rtl.min.css
│      │  │          │  │      bootstrap-reboot.rtl.min.css.map
│      │  │          │  │      bootstrap-utilities.css
│      │  │          │  │      bootstrap-utilities.css.map
│      │  │          │  │      bootstrap-utilities.min.css
│      │  │          │  │      bootstrap-utilities.min.css.map
│      │  │          │  │      bootstrap-utilities.rtl.css
│      │  │          │  │      bootstrap-utilities.rtl.css.map
│      │  │          │  │      bootstrap-utilities.rtl.min.css
│      │  │          │  │      bootstrap-utilities.rtl.min.css.map
│      │  │          │  │      bootstrap.css
│      │  │          │  │      bootstrap.css.map
│      │  │          │  │      bootstrap.min.css
│      │  │          │  │      bootstrap.min.css.map
│      │  │          │  │      bootstrap.rtl.css
│      │  │          │  │      bootstrap.rtl.css.map
│      │  │          │  │      bootstrap.rtl.min.css
│      │  │          │  │      bootstrap.rtl.min.css.map
│      │  │          │  │      
│      │  │          │  └─js
│      │  │          │          bootstrap.bundle.js
│      │  │          │          bootstrap.bundle.js.map
│      │  │          │          bootstrap.bundle.min.js
│      │  │          │          bootstrap.bundle.min.js.map
│      │  │          │          bootstrap.esm.js
│      │  │          │          bootstrap.esm.js.map
│      │  │          │          bootstrap.esm.min.js
│      │  │          │          bootstrap.esm.min.js.map
│      │  │          │          bootstrap.js
│      │  │          │          bootstrap.js.map
│      │  │          │          bootstrap.min.js
│      │  │          │          bootstrap.min.js.map
│      │  │          │          
│      │  │          ├─bootstrap-icons
│      │  │          │  │  bootstrap-icons.css
│      │  │          │  │  bootstrap-icons.json
│      │  │          │  │  bootstrap-icons.min.css
│      │  │          │  │  bootstrap-icons.scss
│      │  │          │  │  
│      │  │          │  └─fonts
│      │  │          │          bootstrap-icons.woff
│      │  │          │          bootstrap-icons.woff2
│      │  │          │          
│      │  │          ├─boxicons
│      │  │          │  ├─css
│      │  │          │  │      animations.css
│      │  │          │  │      boxicons.css
│      │  │          │  │      boxicons.min.css
│      │  │          │  │      transformations.css
│      │  │          │  │      
│      │  │          │  └─fonts
│      │  │          │          boxicons.eot
│      │  │          │          boxicons.svg
│      │  │          │          boxicons.ttf
│      │  │          │          boxicons.woff
│      │  │          │          boxicons.woff2
│      │  │          │          
│      │  │          ├─chart.js
│      │  │          │  │  chart.cjs
│      │  │          │  │  chart.cjs.map
│      │  │          │  │  chart.js
│      │  │          │  │  chart.js.map
│      │  │          │  │  chart.umd.js
│      │  │          │  │  chart.umd.js.map
│      │  │          │  │  helpers.cjs
│      │  │          │  │  helpers.cjs.map
│      │  │          │  │  helpers.js
│      │  │          │  │  helpers.js.map
│      │  │          │  │  index.d.ts
│      │  │          │  │  index.umd.d.ts
│      │  │          │  │  types.d.ts
│      │  │          │  │  
│      │  │          │  ├─chunks
│      │  │          │  │      helpers.segment.cjs
│      │  │          │  │      helpers.segment.cjs.map
│      │  │          │  │      helpers.segment.js
│      │  │          │  │      helpers.segment.js.map
│      │  │          │  │      
│      │  │          │  ├─controllers
│      │  │          │  │      controller.bar.d.ts
│      │  │          │  │      controller.bubble.d.ts
│      │  │          │  │      controller.doughnut.d.ts
│      │  │          │  │      controller.line.d.ts
│      │  │          │  │      controller.pie.d.ts
│      │  │          │  │      controller.polarArea.d.ts
│      │  │          │  │      controller.radar.d.ts
│      │  │          │  │      controller.scatter.d.ts
│      │  │          │  │      index.d.ts
│      │  │          │  │      
│      │  │          │  ├─core
│      │  │          │  │      core.adapters.d.ts
│      │  │          │  │      core.animation.d.ts
│      │  │          │  │      core.animations.d.ts
│      │  │          │  │      core.animations.defaults.d.ts
│      │  │          │  │      core.animator.d.ts
│      │  │          │  │      core.config.d.ts
│      │  │          │  │      core.controller.d.ts
│      │  │          │  │      core.datasetController.d.ts
│      │  │          │  │      core.defaults.d.ts
│      │  │          │  │      core.element.d.ts
│      │  │          │  │      core.interaction.d.ts
│      │  │          │  │      core.layouts.d.ts
│      │  │          │  │      core.layouts.defaults.d.ts
│      │  │          │  │      core.plugins.d.ts
│      │  │          │  │      core.registry.d.ts
│      │  │          │  │      core.scale.autoskip.d.ts
│      │  │          │  │      core.scale.d.ts
│      │  │          │  │      core.scale.defaults.d.ts
│      │  │          │  │      core.ticks.d.ts
│      │  │          │  │      core.typedRegistry.d.ts
│      │  │          │  │      index.d.ts
│      │  │          │  │      
│      │  │          │  ├─elements
│      │  │          │  │      element.arc.d.ts
│      │  │          │  │      element.bar.d.ts
│      │  │          │  │      element.line.d.ts
│      │  │          │  │      element.point.d.ts
│      │  │          │  │      index.d.ts
│      │  │          │  │      
│      │  │          │  ├─helpers
│      │  │          │  │      helpers.canvas.d.ts
│      │  │          │  │      helpers.collection.d.ts
│      │  │          │  │      helpers.color.d.ts
│      │  │          │  │      helpers.config.d.ts
│      │  │          │  │      helpers.config.types.d.ts
│      │  │          │  │      helpers.core.d.ts
│      │  │          │  │      helpers.curve.d.ts
│      │  │          │  │      helpers.dom.d.ts
│      │  │          │  │      helpers.easing.d.ts
│      │  │          │  │      helpers.extras.d.ts
│      │  │          │  │      helpers.interpolation.d.ts
│      │  │          │  │      helpers.intl.d.ts
│      │  │          │  │      helpers.math.d.ts
│      │  │          │  │      helpers.options.d.ts
│      │  │          │  │      helpers.rtl.d.ts
│      │  │          │  │      helpers.segment.d.ts
│      │  │          │  │      index.d.ts
│      │  │          │  │      
│      │  │          │  ├─platform
│      │  │          │  │      index.d.ts
│      │  │          │  │      platform.base.d.ts
│      │  │          │  │      platform.basic.d.ts
│      │  │          │  │      platform.dom.d.ts
│      │  │          │  │      
│      │  │          │  ├─plugins
│      │  │          │  │  │  index.d.ts
│      │  │          │  │  │  plugin.colors.d.ts
│      │  │          │  │  │  plugin.decimation.d.ts
│      │  │          │  │  │  plugin.legend.d.ts
│      │  │          │  │  │  plugin.subtitle.d.ts
│      │  │          │  │  │  plugin.title.d.ts
│      │  │          │  │  │  plugin.tooltip.d.ts
│      │  │          │  │  │  
│      │  │          │  │  └─plugin.filler
│      │  │          │  │          filler.drawing.d.ts
│      │  │          │  │          filler.helper.d.ts
│      │  │          │  │          filler.options.d.ts
│      │  │          │  │          filler.segment.d.ts
│      │  │          │  │          filler.target.d.ts
│      │  │          │  │          filler.target.stack.d.ts
│      │  │          │  │          index.d.ts
│      │  │          │  │          simpleArc.d.ts
│      │  │          │  │          
│      │  │          │  ├─scales
│      │  │          │  │      index.d.ts
│      │  │          │  │      scale.category.d.ts
│      │  │          │  │      scale.linear.d.ts
│      │  │          │  │      scale.linearbase.d.ts
│      │  │          │  │      scale.logarithmic.d.ts
│      │  │          │  │      scale.radialLinear.d.ts
│      │  │          │  │      scale.time.d.ts
│      │  │          │  │      scale.timeseries.d.ts
│      │  │          │  │      
│      │  │          │  └─types
│      │  │          │          animation.d.ts
│      │  │          │          basic.d.ts
│      │  │          │          color.d.ts
│      │  │          │          geometric.d.ts
│      │  │          │          index.d.ts
│      │  │          │          layout.d.ts
│      │  │          │          utils.d.ts
│      │  │          │          
│      │  │          ├─echarts
│      │  │          │  │  echarts.common.js
│      │  │          │  │  echarts.common.js.map
│      │  │          │  │  echarts.common.min.js
│      │  │          │  │  echarts.esm.js
│      │  │          │  │  echarts.esm.js.map
│      │  │          │  │  echarts.esm.min.js
│      │  │          │  │  echarts.esm.min.mjs
│      │  │          │  │  echarts.esm.mjs
│      │  │          │  │  echarts.esm.mjs.map
│      │  │          │  │  echarts.js
│      │  │          │  │  echarts.js.map
│      │  │          │  │  echarts.min.js
│      │  │          │  │  echarts.simple.js
│      │  │          │  │  echarts.simple.js.map
│      │  │          │  │  echarts.simple.min.js
│      │  │          │  │  package.json
│      │  │          │  │  
│      │  │          │  └─extension
│      │  │          │          bmap.js
│      │  │          │          bmap.js.map
│      │  │          │          bmap.min.js
│      │  │          │          dataTool.js
│      │  │          │          dataTool.js.map
│      │  │          │          dataTool.min.js
│      │  │          │          
│      │  │          ├─php-email-form
│      │  │          │      validate.js
│      │  │          │      
│      │  │          ├─quill
│      │  │          │      quill.bubble.css
│      │  │          │      quill.bubble.css.map
│      │  │          │      quill.core.css
│      │  │          │      quill.core.css.map
│      │  │          │      quill.core.js
│      │  │          │      quill.core.js.LICENSE.txt
│      │  │          │      quill.core.js.map
│      │  │          │      quill.js
│      │  │          │      quill.js.LICENSE.txt
│      │  │          │      quill.js.map
│      │  │          │      quill.snow.css
│      │  │          │      quill.snow.css.map
│      │  │          │      
│      │  │          ├─remixicon
│      │  │          │      remixicon.css
│      │  │          │      remixicon.eot
│      │  │          │      remixicon.glyph.json
│      │  │          │      remixicon.less
│      │  │          │      remixicon.svg
│      │  │          │      remixicon.symbol.svg
│      │  │          │      remixicon.ttf
│      │  │          │      remixicon.woff
│      │  │          │      remixicon.woff2
│      │  │          │      
│      │  │          ├─simple-datatables
│      │  │          │      simple-datatables.js
│      │  │          │      style.css
│      │  │          │      
│      │  │          └─tinymce
│      │  │              │  bower.json
│      │  │              │  CHANGELOG.md
│      │  │              │  composer.json
│      │  │              │  license.md
│      │  │              │  package.json
│      │  │              │  README.md
│      │  │              │  tinymce.d.ts
│      │  │              │  tinymce.js
│      │  │              │  tinymce.min.js
│      │  │              │  
│      │  │              ├─icons
│      │  │              │  └─default
│      │  │              │          icons.js
│      │  │              │          icons.min.js
│      │  │              │          index.js
│      │  │              │          
│      │  │              ├─models
│      │  │              │  └─dom
│      │  │              │          index.js
│      │  │              │          model.js
│      │  │              │          model.min.js
│      │  │              │          
│      │  │              ├─plugins
│      │  │              │  ├─accordion
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─advlist
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─anchor
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─autolink
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─autoresize
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─autosave
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─charmap
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─code
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─codesample
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─directionality
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─emoticons
│      │  │              │  │  │  index.js
│      │  │              │  │  │  plugin.js
│      │  │              │  │  │  plugin.min.js
│      │  │              │  │  │  
│      │  │              │  │  └─js
│      │  │              │  │          emojiimages.js
│      │  │              │  │          emojiimages.min.js
│      │  │              │  │          emojis.js
│      │  │              │  │          emojis.min.js
│      │  │              │  │          
│      │  │              │  ├─fullscreen
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─help
│      │  │              │  │  │  index.js
│      │  │              │  │  │  plugin.js
│      │  │              │  │  │  plugin.min.js
│      │  │              │  │  │  
│      │  │              │  │  └─js
│      │  │              │  │      └─i18n
│      │  │              │  │          └─keynav
│      │  │              │  │                  ar.js
│      │  │              │  │                  bg_BG.js
│      │  │              │  │                  ca.js
│      │  │              │  │                  cs.js
│      │  │              │  │                  da.js
│      │  │              │  │                  de.js
│      │  │              │  │                  el.js
│      │  │              │  │                  en.js
│      │  │              │  │                  es.js
│      │  │              │  │                  eu.js
│      │  │              │  │                  fa.js
│      │  │              │  │                  fi.js
│      │  │              │  │                  fr_FR.js
│      │  │              │  │                  he_IL.js
│      │  │              │  │                  hi.js
│      │  │              │  │                  hr.js
│      │  │              │  │                  hu_HU.js
│      │  │              │  │                  id.js
│      │  │              │  │                  it.js
│      │  │              │  │                  ja.js
│      │  │              │  │                  kk.js
│      │  │              │  │                  ko_KR.js
│      │  │              │  │                  ms.js
│      │  │              │  │                  nb_NO.js
│      │  │              │  │                  nl.js
│      │  │              │  │                  pl.js
│      │  │              │  │                  pt_BR.js
│      │  │              │  │                  pt_PT.js
│      │  │              │  │                  ro.js
│      │  │              │  │                  ru.js
│      │  │              │  │                  sk.js
│      │  │              │  │                  sl_SI.js
│      │  │              │  │                  sv_SE.js
│      │  │              │  │                  th_TH.js
│      │  │              │  │                  tr.js
│      │  │              │  │                  uk.js
│      │  │              │  │                  vi.js
│      │  │              │  │                  zh_CN.js
│      │  │              │  │                  zh_TW.js
│      │  │              │  │                  
│      │  │              │  ├─image
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─importcss
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─insertdatetime
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─link
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─lists
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─media
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─nonbreaking
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─pagebreak
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─preview
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─quickbars
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─save
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─searchreplace
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─table
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─visualblocks
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  ├─visualchars
│      │  │              │  │      index.js
│      │  │              │  │      plugin.js
│      │  │              │  │      plugin.min.js
│      │  │              │  │      
│      │  │              │  └─wordcount
│      │  │              │          index.js
│      │  │              │          plugin.js
│      │  │              │          plugin.min.js
│      │  │              │          
│      │  │              ├─skins
│      │  │              │  ├─content
│      │  │              │  │  ├─dark
│      │  │              │  │  │      content.css
│      │  │              │  │  │      content.js
│      │  │              │  │  │      content.min.css
│      │  │              │  │  │      
│      │  │              │  │  ├─default
│      │  │              │  │  │      content.css
│      │  │              │  │  │      content.js
│      │  │              │  │  │      content.min.css
│      │  │              │  │  │      
│      │  │              │  │  ├─document
│      │  │              │  │  │      content.css
│      │  │              │  │  │      content.js
│      │  │              │  │  │      content.min.css
│      │  │              │  │  │      
│      │  │              │  │  ├─tinymce-5
│      │  │              │  │  │      content.css
│      │  │              │  │  │      content.js
│      │  │              │  │  │      content.min.css
│      │  │              │  │  │      
│      │  │              │  │  ├─tinymce-5-dark
│      │  │              │  │  │      content.css
│      │  │              │  │  │      content.js
│      │  │              │  │  │      content.min.css
│      │  │              │  │  │      
│      │  │              │  │  └─writer
│      │  │              │  │          content.css
│      │  │              │  │          content.js
│      │  │              │  │          content.min.css
│      │  │              │  │          
│      │  │              │  └─ui
│      │  │              │      ├─oxide
│      │  │              │      │      content.css
│      │  │              │      │      content.inline.css
│      │  │              │      │      content.inline.js
│      │  │              │      │      content.inline.min.css
│      │  │              │      │      content.js
│      │  │              │      │      content.min.css
│      │  │              │      │      skin.css
│      │  │              │      │      skin.js
│      │  │              │      │      skin.min.css
│      │  │              │      │      skin.shadowdom.css
│      │  │              │      │      skin.shadowdom.js
│      │  │              │      │      skin.shadowdom.min.css
│      │  │              │      │      
│      │  │              │      ├─oxide-dark
│      │  │              │      │      content.css
│      │  │              │      │      content.inline.css
│      │  │              │      │      content.inline.js
│      │  │              │      │      content.inline.min.css
│      │  │              │      │      content.js
│      │  │              │      │      content.min.css
│      │  │              │      │      skin.css
│      │  │              │      │      skin.js
│      │  │              │      │      skin.min.css
│      │  │              │      │      skin.shadowdom.css
│      │  │              │      │      skin.shadowdom.js
│      │  │              │      │      skin.shadowdom.min.css
│      │  │              │      │      
│      │  │              │      ├─tinymce-5
│      │  │              │      │      content.css
│      │  │              │      │      content.inline.css
│      │  │              │      │      content.inline.js
│      │  │              │      │      content.inline.min.css
│      │  │              │      │      content.js
│      │  │              │      │      content.min.css
│      │  │              │      │      skin.css
│      │  │              │      │      skin.js
│      │  │              │      │      skin.min.css
│      │  │              │      │      skin.shadowdom.css
│      │  │              │      │      skin.shadowdom.js
│      │  │              │      │      skin.shadowdom.min.css
│      │  │              │      │      
│      │  │              │      └─tinymce-5-dark
│      │  │              │              content.css
│      │  │              │              content.inline.css
│      │  │              │              content.inline.js
│      │  │              │              content.inline.min.css
│      │  │              │              content.js
│      │  │              │              content.min.css
│      │  │              │              skin.css
│      │  │              │              skin.js
│      │  │              │              skin.min.css
│      │  │              │              skin.shadowdom.css
│      │  │              │              skin.shadowdom.js
│      │  │              │              skin.shadowdom.min.css
│      │  │              │              
│      │  │              └─themes
│      │  │                  └─silver
│      │  │                          index.js
│      │  │                          theme.js
│      │  │                          theme.min.js
│      │  │                          
│      │  ├─css
│      │  │  └─userinterface
│      │  │          easy-responsive-shortcodes.css
│      │  │          font-awesome.min.css
│      │  │          style.css
│      │  │          woocommerce-layout.css
│      │  │          woocommerce-smallscreen.css
│      │  │          woocommerce.css
│      │  │          
│      │  ├─font
│      │  │  └─userinterface
│      │  │          behance.eot
│      │  │          behance.svg
│      │  │          behance.ttf
│      │  │          behance.woff
│      │  │          fontawesome-webfont.eot
│      │  │          fontawesome-webfont.svg
│      │  │          fontawesome-webfont.ttf
│      │  │          fontawesome-webfont.woff
│      │  │          fontawesome-webfont.woff2
│      │  │          FontAwesome.otf
│      │  │          genericons-regular-webfont.eot
│      │  │          genericons-regular-webfont.svg
│      │  │          genericons-regular-webfont.ttf
│      │  │          genericons-regular-webfont.woff
│      │  │          
│      │  ├─forms
│      │  │      contact.php
│      │  │      Readme.txt
│      │  │      
│      │  └─js
│      │      └─userinterface
│      │              accordion.js
│      │              jquery.js
│      │              masonry.pkgd.min.js
│      │              plugins.js
│      │              scripts.js
│      │              tabs.js
│      │              toggle.js
│      │              validate.js
│      │              
│      └─templates
│          │  customer-main.html
│          │  
│          ├─board
│          │      detail.html
│          │      new.html
│          │      notice.html
│          │      QnA.html
│          │      update.html
│          │      
│          ├─login
│          │      login.html
│          │      
│          ├─main
│          │      main.html
│          │      
│          ├─member
│          │      mail-form.html
│          │      mail-sent.html
│          │      members.html
│          │      
│          ├─order
│          │      OrderChange.html
│          │      OrderFind.html
│          │      
│          ├─product
│          │      delete.html
│          │      product.html
│          │      productRegister.html
│          │      update.html
│          │      
│          ├─sale
│          │      sale.html
│          │      
│          ├─userinterface
│          │      changyeon-shop-single.html
│          │      contact.php
│          │      hyunkyun-shop-single.html
│          │      index.html
│          │      jeonghun-shop-single.html
│          │      license.html
│          │      love-shop-single.html
│          │      seungjae-shop-single.html
│          │      ssg-shop-single.html
│          │      yoonji-shop-single.html
│          │      yoonjung-shop-single.html
│          │      
│          └─warehouse
│                  InAndOut.html
│                  list.html
│                  WareHouseLog.html
│                  
└─test
    └─java
        └─com
            └─ohgiraffers
                └─samsam
                        SamsamApplicationTests.java
                        








## 📋역할 분담

#### 서윤정
* 쇼핑몰 관리자
  1. 
  2. 
  3. 


#### 석현균
* 창고 관리자
  1. 
  2. 

#### 이창연
* 쇼핑몰 관리자
  1. 
  2. 

#### 장윤지
* 쇼핑몰 관리
  1. 
  2.

#### 이정훈
* 창고 관리자, 쇼핑몰 관리자, 로그인
  1. 
  2.

package in.tech_camp.chat_app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//設定ですよー宣言 先に読み込んでもらう
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // 静的リソースとurlの紐付けをしまーす
    registry.addResourceHandler("/uploads/**")
            .addResourceLocations("file:src/main/resources/static/uploads/");
            //このurlが来たら、ほしいの下のルートのとこにおいてるよー
  }
}

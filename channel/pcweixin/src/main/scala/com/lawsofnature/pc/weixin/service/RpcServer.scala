package com.lawsofnature.pc.weixin.service

import java.util

import com.google.inject.name.Names
import com.google.inject.{AbstractModule, Guice}
import com.jxjxgo.common.helper.ConfigHelper
import com.jxjxgo.scrooge.thrift.template.{ScroogeThriftServerTemplate, ScroogeThriftServerTemplateImpl}
import com.twitter.scrooge.ThriftService

/**
  * Created by fangzhongwei on 2017/2/5.
  */
object RpcServer {
  def main(args: Array[String]): Unit = {

    val injector = Guice.createInjector(new AbstractModule() {
      override def configure() {
        val map: util.HashMap[String, String] = ConfigHelper.configMap
        Names.bindProperties(binder(), map)

        bind(classOf[WeixinService]).to(classOf[WeixinService]).asEagerSingleton()
        bind(classOf[ThriftService]).to(classOf[PCWeixinServiceImpl]).asEagerSingleton()
        bind(classOf[ScroogeThriftServerTemplate]).to(classOf[ScroogeThriftServerTemplateImpl]).asEagerSingleton()

      }
    })

    injector.getInstance(classOf[ScroogeThriftServerTemplate]).init

  }
}

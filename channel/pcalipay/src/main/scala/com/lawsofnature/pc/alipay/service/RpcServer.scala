package com.lawsofnature.pc.alipay.service

import java.util

import com.google.inject.{AbstractModule, Guice, TypeLiteral}
import com.google.inject.name.Names
import com.jxjxgo.common.helper.ConfigHelper
import com.jxjxgo.scrooge.thrift.template.{ScroogeThriftServerTemplate, ScroogeThriftServerTemplateImpl}
import com.twitter.finagle.Thrift
import com.twitter.scrooge.ThriftService
import com.twitter.util.Future
import com.typesafe.config.{Config, ConfigFactory}

/**
  * Created by fangzhongwei on 2017/2/5.
  */
object RpcServer{
  def main(args: Array[String]): Unit = {

    val injector = Guice.createInjector(new AbstractModule() {
      override def configure() {
        val map: util.HashMap[String, String] = ConfigHelper.configMap
        Names.bindProperties(binder(), map)

        bind(classOf[AlipayService]).to(classOf[AlipayServiceImpl]).asEagerSingleton()
        bind(classOf[ThriftService]).to(classOf[PCAlipayServiceImpl]).asEagerSingleton()
        bind(classOf[ScroogeThriftServerTemplate]).to(classOf[ScroogeThriftServerTemplateImpl]).asEagerSingleton()

      }
    })

    injector.getInstance(classOf[ScroogeThriftServerTemplate]).init

  }
}

package com.lawsofnature.pc.weixin.helper

/**
  * Created by fangzhongwei on 2017/1/18.
  */
object XMLBuilder {

  def buildXmlString(map: Map[String, String]): String = {
    val buffer: StringBuilder = new StringBuilder
    buffer.append("<xml>")
    map.foreach {
      e => buffer.append("<").append(e._1).append("><![CDATA[").append(e._2).append("]]></").append(e._1).append(">")
    }
    buffer.append("</xml>")
    buffer.toString
  }

}

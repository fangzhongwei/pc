/**
 * Generated by Scrooge
 *   version: 4.5.0
 *   rev: 014664de600267b36809bbc85225e26aec286216
 *   built at: 20160203-205352
 */
package com.jxjxgo.pc.rpc.domain

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object DownloadWaterRecordsResponse extends ThriftStructCodec3[DownloadWaterRecordsResponse] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("DownloadWaterRecordsResponse")
  val CodeField = new TField("code", TType.STRING, 1)
  val CodeFieldManifest = implicitly[Manifest[String]]
  val ChannelCodeField = new TField("channelCode", TType.STRING, 2)
  val ChannelCodeFieldManifest = implicitly[Manifest[String]]
  val WaterRecordlistField = new TField("waterRecordlist", TType.LIST, 3)
  val WaterRecordlistFieldManifest = implicitly[Manifest[Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      CodeField,
      false,
      false,
      CodeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      ChannelCodeField,
      false,
      false,
      ChannelCodeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      WaterRecordlistField,
      false,
      false,
      WaterRecordlistFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[com.jxjxgo.pc.rpc.domain.WaterRecord]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: DownloadWaterRecordsResponse): Unit = {
  }

  def withoutPassthroughFields(original: DownloadWaterRecordsResponse): DownloadWaterRecordsResponse =
    new Immutable(
      code =
        {
          val field = original.code
          field
        },
      channelCode =
        {
          val field = original.channelCode
          field
        },
      waterRecordlist =
        {
          val field = original.waterRecordlist
          field.map { field =>
            com.jxjxgo.pc.rpc.domain.WaterRecord.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: DownloadWaterRecordsResponse, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): DownloadWaterRecordsResponse = {

    var codeOffset: Int = -1
    var channelCodeOffset: Int = -1
    var waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]()

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                codeOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'code' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                channelCodeOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'channelCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
    
                waterRecordlist = readWaterRecordlistValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'waterRecordlist' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      codeOffset,
      channelCodeOffset,
      waterRecordlist,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): DownloadWaterRecordsResponse =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): DownloadWaterRecordsResponse = {
    var code: String = ""
    var channelCode: String = ""
    var waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]()
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                code = readCodeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'code' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                channelCode = readChannelCodeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'channelCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.LIST =>
                waterRecordlist = readWaterRecordlistValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'waterRecordlist' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      code,
      channelCode,
      waterRecordlist,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    code: String = "",
    channelCode: String = "",
    waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]()
  ): DownloadWaterRecordsResponse =
    new Immutable(
      code,
      channelCode,
      waterRecordlist
    )

  def unapply(_item: DownloadWaterRecordsResponse): _root_.scala.Option[scala.Product3[String, String, Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]]] = _root_.scala.Some(_item)


  @inline private def readCodeValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeCodeField(code_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(CodeField)
    writeCodeValue(code_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeCodeValue(code_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(code_item)
  }

  @inline private def readChannelCodeValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeChannelCodeField(channelCode_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ChannelCodeField)
    writeChannelCodeValue(channelCode_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeChannelCodeValue(channelCode_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(channelCode_item)
  }

  @inline private def readWaterRecordlistValue(_iprot: TProtocol): Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[com.jxjxgo.pc.rpc.domain.WaterRecord](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          com.jxjxgo.pc.rpc.domain.WaterRecord.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeWaterRecordlistField(waterRecordlist_item: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(WaterRecordlistField)
    writeWaterRecordlistValue(waterRecordlist_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeWaterRecordlistValue(waterRecordlist_item: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, waterRecordlist_item.size))
    waterRecordlist_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = waterRecordlist_item.size
        while (_i < _size) {
          val waterRecordlist_item_element = waterRecordlist_item(_i)
          waterRecordlist_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        waterRecordlist_item.foreach { waterRecordlist_item_element =>
          waterRecordlist_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }


  object Immutable extends ThriftStructCodec3[DownloadWaterRecordsResponse] {
    override def encode(_item: DownloadWaterRecordsResponse, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): DownloadWaterRecordsResponse = DownloadWaterRecordsResponse.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[DownloadWaterRecordsResponse] = DownloadWaterRecordsResponse.metaData
  }

  /**
   * The default read-only implementation of DownloadWaterRecordsResponse.  You typically should not need to
   * directly reference this class; instead, use the DownloadWaterRecordsResponse.apply method to construct
   * new instances.
   */
  class Immutable(
      val code: String,
      val channelCode: String,
      val waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DownloadWaterRecordsResponse {
    def this(
      code: String = "",
      channelCode: String = "",
      waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]()
    ) = this(
      code,
      channelCode,
      waterRecordlist,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      codeOffset: Int,
      channelCodeOffset: Int,
      val waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DownloadWaterRecordsResponse {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val code: String =
      if (codeOffset == -1)
        ""
      else {
        _proto.decodeString(_buf, codeOffset)
      }
    lazy val channelCode: String =
      if (channelCodeOffset == -1)
        ""
      else {
        _proto.decodeString(_buf, channelCodeOffset)
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the DownloadWaterRecordsResponse trait with additional state or
   * behavior and implement the read-only methods from DownloadWaterRecordsResponse using an underlying
   * instance.
   */
  trait Proxy extends DownloadWaterRecordsResponse {
    protected def _underlying_DownloadWaterRecordsResponse: DownloadWaterRecordsResponse
    override def code: String = _underlying_DownloadWaterRecordsResponse.code
    override def channelCode: String = _underlying_DownloadWaterRecordsResponse.channelCode
    override def waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = _underlying_DownloadWaterRecordsResponse.waterRecordlist
    override def _passthroughFields = _underlying_DownloadWaterRecordsResponse._passthroughFields
  }
}

trait DownloadWaterRecordsResponse
  extends ThriftStruct
  with scala.Product3[String, String, Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]]
  with java.io.Serializable
{
  import DownloadWaterRecordsResponse._

  def code: String
  def channelCode: String
  def waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = code
  def _2 = channelCode
  def _3 = waterRecordlist


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (code ne null) {
                writeCodeValue(code, _oprot)
                _root_.scala.Some(DownloadWaterRecordsResponse.CodeField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (channelCode ne null) {
                writeChannelCodeValue(channelCode, _oprot)
                _root_.scala.Some(DownloadWaterRecordsResponse.ChannelCodeField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (waterRecordlist ne null) {
                writeWaterRecordlistValue(waterRecordlist, _oprot)
                _root_.scala.Some(DownloadWaterRecordsResponse.WaterRecordlistField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): DownloadWaterRecordsResponse = {
    var code: String = this.code
    var channelCode: String = this.channelCode
    var waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = this.waterRecordlist
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        code = readCodeValue(_blob.read)
      case 2 =>
        channelCode = readChannelCodeValue(_blob.read)
      case 3 =>
        waterRecordlist = readWaterRecordlistValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      code,
      channelCode,
      waterRecordlist,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): DownloadWaterRecordsResponse = {
    var code: String = this.code
    var channelCode: String = this.channelCode
    var waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = this.waterRecordlist

    _fieldId match {
      case 1 =>
        code = ""
      case 2 =>
        channelCode = ""
      case 3 =>
        waterRecordlist = Seq[com.jxjxgo.pc.rpc.domain.WaterRecord]()
      case _ =>
    }
    new Immutable(
      code,
      channelCode,
      waterRecordlist,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetCode: DownloadWaterRecordsResponse = unsetField(1)

  def unsetChannelCode: DownloadWaterRecordsResponse = unsetField(2)

  def unsetWaterRecordlist: DownloadWaterRecordsResponse = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    DownloadWaterRecordsResponse.validate(this)
    _oprot.writeStructBegin(Struct)
    if (code ne null) writeCodeField(code, _oprot)
    if (channelCode ne null) writeChannelCodeField(channelCode, _oprot)
    if (waterRecordlist ne null) writeWaterRecordlistField(waterRecordlist, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    code: String = this.code,
    channelCode: String = this.channelCode,
    waterRecordlist: Seq[com.jxjxgo.pc.rpc.domain.WaterRecord] = this.waterRecordlist,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): DownloadWaterRecordsResponse =
    new Immutable(
      code,
      channelCode,
      waterRecordlist,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[DownloadWaterRecordsResponse]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[DownloadWaterRecordsResponse]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.code
    case 1 => this.channelCode
    case 2 => this.waterRecordlist
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "DownloadWaterRecordsResponse"
}
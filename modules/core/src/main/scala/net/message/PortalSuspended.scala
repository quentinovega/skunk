package skunk.net.message

import scodec.Decoder

case object PortalSuspended extends BackendMessage {
  final val Tag = 's'
  def decoder = Decoder.point(PortalSuspended)
}
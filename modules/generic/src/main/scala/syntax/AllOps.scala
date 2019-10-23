// Copyright (c) 2018 by Rob Norris
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package skunk.generic.syntax

trait ToAllOps
  extends ToCodecOps
     with ToEncoderOps
     with ToDecoderOps

object all extends ToAllOps
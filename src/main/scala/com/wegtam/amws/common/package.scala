/*
 * Copyright (c) 2017 Contributors as noted in the AUTHORS.md file
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.wegtam.amws

package object common {
  type ApiVersion        = String
  type ParameterName     = String
  type ParameterValue    = String
  type RequestParameters = Map[ParameterName, ParameterValue]
}

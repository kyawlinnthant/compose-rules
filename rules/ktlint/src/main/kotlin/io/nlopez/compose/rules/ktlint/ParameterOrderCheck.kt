// Copyright 2023 Nacho Lopez
// SPDX-License-Identifier: Apache-2.0
package io.nlopez.compose.rules.ktlint

import io.nlopez.compose.rules.ParameterOrder
import io.nlopez.rules.core.ComposeKtVisitor
import io.nlopez.rules.core.ktlint.KtlintRule

class ParameterOrderCheck :
    KtlintRule("compose:param-order-check"),
    ComposeKtVisitor by ParameterOrder()

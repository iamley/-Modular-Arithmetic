/*
 * %W% %E% cripto
 *
 * Copyright (c) 2020-2021 cripto, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of cripto
 * Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with cripto.
 *
 * cripto MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. cripto SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.cripto.modulararithmetic.interfaces.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Allow to initialize the application
 *
 * @version 	1.0.0-alpha - 15 Sep 2020
 * @author 		Leidy Lorena Pulido - leidy.pulido@imagemaker.com
 * @since 		1.0.0-alpha - 15 Sep 2020
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> implements Serializable {
    private List<T> data;
}
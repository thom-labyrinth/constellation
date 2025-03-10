/*
 * Copyright 2010-2021 Australian Signals Directorate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package au.gov.asd.tac.constellation.views.histogram.bins.edgeaggregates;

import au.gov.asd.tac.constellation.graph.GraphReadMethods;
import au.gov.asd.tac.constellation.views.histogram.Bin;
import au.gov.asd.tac.constellation.views.histogram.bins.FloatBin;

/**
 * A bin that holds float values representing the maximum of all transaction
 * values under a single edge.
 *
 * @author sirius
 */
public class EdgeMaxTransactionFloatAttributeBin extends FloatBin {

    @Override
    public void setKey(GraphReadMethods graph, int attribute, int element) {
        float max = Float.MIN_VALUE;
        final int transactionCount = graph.getEdgeTransactionCount(element);
        for (int t = 0; t < transactionCount; t++) {
            final int transaction = graph.getEdgeTransaction(element, t);
            max = Math.max(graph.getFloatValue(attribute, transaction), max);
        }
        key = max;
    }

    @Override
    public Bin create() {
        return new EdgeMaxTransactionFloatAttributeBin();
    }
}

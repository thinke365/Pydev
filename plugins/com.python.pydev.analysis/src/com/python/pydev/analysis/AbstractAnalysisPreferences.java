/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.python.pydev.analysis;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractAnalysisPreferences implements IAnalysisPreferences{


    private Map<Integer, String> typeToIgnoreMessage;
    public String getRequiredMessageToIgnore(int type) {
        if(typeToIgnoreMessage == null){
            typeToIgnoreMessage = new HashMap<Integer, String>();
            typeToIgnoreMessage.put( TYPE_UNUSED_IMPORT               , MSG_TO_IGNORE_TYPE_UNUSED_IMPORT               );
            typeToIgnoreMessage.put( TYPE_UNUSED_VARIABLE             , MSG_TO_IGNORE_TYPE_UNUSED_VARIABLE             );
            typeToIgnoreMessage.put( TYPE_UNUSED_PARAMETER            , MSG_TO_IGNORE_TYPE_UNUSED_PARAMETER            );
            typeToIgnoreMessage.put( TYPE_UNDEFINED_VARIABLE          , MSG_TO_IGNORE_TYPE_UNDEFINED_VARIABLE          );
            typeToIgnoreMessage.put( TYPE_DUPLICATED_SIGNATURE        , MSG_TO_IGNORE_TYPE_DUPLICATED_SIGNATURE        );
            typeToIgnoreMessage.put( TYPE_REIMPORT                    , MSG_TO_IGNORE_TYPE_REIMPORT                    );
            typeToIgnoreMessage.put( TYPE_UNRESOLVED_IMPORT           , MSG_TO_IGNORE_TYPE_UNRESOLVED_IMPORT           );
            typeToIgnoreMessage.put( TYPE_NO_SELF                     , MSG_TO_IGNORE_TYPE_NO_SELF                     );
            typeToIgnoreMessage.put( TYPE_UNUSED_WILD_IMPORT          , MSG_TO_IGNORE_TYPE_UNUSED_WILD_IMPORT          );
            typeToIgnoreMessage.put( TYPE_UNDEFINED_IMPORT_VARIABLE   , MSG_TO_IGNORE_TYPE_UNDEFINED_IMPORT_VARIABLE   );
            typeToIgnoreMessage.put( TYPE_NO_EFFECT_STMT              , MSG_TO_IGNORE_TYPE_NO_EFFECT_STMT              );
            typeToIgnoreMessage.put( TYPE_INDENTATION_PROBLEM         , MSG_TO_IGNORE_TYPE_INDENTATION_PROBLEM         );
        }
        return typeToIgnoreMessage.get(type);
    }
}

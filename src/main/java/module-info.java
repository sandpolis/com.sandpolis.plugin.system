//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
module com.sandpolis.plugin.osquery {
	exports com.sandpolis.plugin.osquery.state;

	requires com.google.common;
	requires com.sandpolis.core.foundation;
	requires com.sandpolis.core.instance;
}

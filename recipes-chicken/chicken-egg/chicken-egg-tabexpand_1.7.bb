SECTION = "devel/chicken"
DESCRIPTION = "Tab Character Expansion in Scheme"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://tabexpand.meta;md5=513ed0c10734117af505f8f006d20c69"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tabexpand/tabexpand-${PV}.tar.gz"

SRC_URI[md5sum] = "9d21cc9401a73f371f4a5e071f40961e"
SRC_URI[sha256sum] = "e6c71c78df47369c7172f75dfabea35a4873c1550b020e034f5fde38c7059143"

S = "${WORKDIR}/tabexpand-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

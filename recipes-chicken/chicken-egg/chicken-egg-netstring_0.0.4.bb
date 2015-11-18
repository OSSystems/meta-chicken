SECTION = "devel/chicken"
DESCRIPTION = "Parsing and writing <a href="http://cr.yp.to/proto/netstrings.txt">netstrings</a>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://netstring.meta;md5=d7c68442db85accd418978f7d30876cb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/netstring/netstring-${PV}.tar.gz"

SRC_URI[md5sum] = "b8e2b2d00d3ec4a6bc3fcb2741fb6502"
SRC_URI[sha256sum] = "01b1e7fe01ad1f142579ecb95817ae0b4b9be560b9b4ccd6acddead222a53fe1"

S = "${WORKDIR}/netstring-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "Interface to the syslog-functions"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://syslog.meta;md5=c290d5db1cf5798c87dd1391fbe2e6aa"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/syslog/syslog-${PV}.tar.gz"

SRC_URI[md5sum] = "0d07ad3f58f619d1a1c9d0c796236a4b"
SRC_URI[sha256sum] = "16881cc0aa6036489bf7ffb8c40ec111b835a2aee44aea2872da4867fb66b90d"

S = "${WORKDIR}/syslog-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

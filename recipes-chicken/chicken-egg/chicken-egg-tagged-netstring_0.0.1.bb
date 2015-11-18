SECTION = "devel/chicken"
DESCRIPTION = "Parsing and writing tagged netstrings (http://tnetstrings.org/)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tagged-netstring.meta;md5=c39ed0ac95fe9c09da4e2c775281993e"
DEPENDS_append_class-cross = " chicken-egg-netstring-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-netstring-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-netstring chicken-egg-netstring-crosssdk"
DEPENDS = " chicken-egg-netstring chicken-egg-netstring-cross"
RDEPENDS_${PN} = " chicken-egg-netstring"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tagged-netstring/tagged-netstring-${PV}.tar.gz"

SRC_URI[md5sum] = "533b29b45d31f43fab4d994db75724d8"
SRC_URI[sha256sum] = "923f96765f6728352beeba9ae7bb09e63436c0f47eedb3c1a1115a54144f061e"

S = "${WORKDIR}/tagged-netstring-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

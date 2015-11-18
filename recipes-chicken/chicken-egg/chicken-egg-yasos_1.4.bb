SECTION = "devel/chicken"
DESCRIPTION = "A very simple OOP system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://yasos.meta;md5=cfbd14a7e4c1e39ad580f5acc3ece2e6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/yasos/yasos-${PV}.tar.gz"

SRC_URI[md5sum] = "023c952a7f7c757f4d2c68baaba397fa"
SRC_URI[sha256sum] = "f09c3f674b050a3f946d6f2107ad5d88412ddb2ce0a1ff57eb69be0b3689c031"

S = "${WORKDIR}/yasos-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

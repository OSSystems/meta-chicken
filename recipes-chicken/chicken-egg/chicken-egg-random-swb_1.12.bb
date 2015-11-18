SECTION = "devel/chicken"
DESCRIPTION = "A random number generator based on the subtract-with-borrow (SWB) method."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://random-swb.meta;md5=8c3bc47528739d4fd25357d42786e3f5"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/random-swb/random-swb-${PV}.tar.gz"

SRC_URI[md5sum] = "5f4086600544bb8f0ce57ea4caa39954"
SRC_URI[sha256sum] = "8df3dcb7c3afb629cf9ff725ea6ca0f6029d8f33d065f44cd9773efb84509ffc"

S = "${WORKDIR}/random-swb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

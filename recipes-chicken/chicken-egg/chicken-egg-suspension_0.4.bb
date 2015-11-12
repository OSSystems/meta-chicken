SECTION = "devel/chicken"
DESCRIPTION = "Serialized limited continuations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://suspension.meta;md5=78e02e279f518b16efaf25c01b389d35"
DEPENDS_append_class-cross = " chicken-egg-s11n-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-s11n-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-s11n chicken-egg-s11n-crosssdk"
DEPENDS = " chicken-egg-s11n chicken-egg-s11n-cross"
RDEPENDS_${PN} = " chicken-egg-s11n"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/suspension/suspension-${PV}.tar.gz"

SRC_URI[md5sum] = "e96b87de9a7a3b4fa2f7399dec56bd4e"
SRC_URI[sha256sum] = "17c8707fbc60f1bce81ba735443042592a2c2c9b38d140be3cc1172525ffe0d0"

S = "${WORKDIR}/suspension-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

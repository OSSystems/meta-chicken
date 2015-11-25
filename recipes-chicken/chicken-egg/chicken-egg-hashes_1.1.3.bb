SECTION = "devel/chicken"
DESCRIPTION = "Miscellaneous Hash Functions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hashes.meta;md5=e3f888b00d971f265d299721ec155c6c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-message-digest-cross chicken-egg-miscmacros-cross chicken-egg-moremacros-cross chicken-egg-box-cross chicken-egg-crc-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-box-crosssdk chicken-egg-crc-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-message-digest nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-moremacros nativesdk-chicken-egg-box nativesdk-chicken-egg-crc nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-box-crosssdk chicken-egg-crc-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-message-digest chicken-egg-miscmacros chicken-egg-moremacros chicken-egg-box chicken-egg-crc chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-message-digest-cross chicken-egg-miscmacros-cross chicken-egg-moremacros-cross chicken-egg-box-cross chicken-egg-crc-cross chicken-egg-check-errors-cross chicken-egg-hashes-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-message-digest chicken-egg-miscmacros chicken-egg-moremacros chicken-egg-box chicken-egg-crc chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hashes/hashes-${PV}.tar.gz"

SRC_URI[md5sum] = "169bb7f57ff4f61c50b0ac147478d2b4"
SRC_URI[sha256sum] = "9db68547380e744c37a7f4741ec65bfb8a7308b18df47e8f5dec9258ebac1122"

S = "${WORKDIR}/hashes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "An object inspector for Chicken"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dissector.meta;md5=097ece00df03830e14724a539c4d08fc"
DEPENDS_append_class-cross = " chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-make-cross"
RDEPENDS_${PN} = " chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dissector/dissector-${PV}.tar.gz"

SRC_URI[md5sum] = "072aca1989b442ae01eda1d32afc2838"
SRC_URI[sha256sum] = "d6274c6d50378d3700c8efb226c6592c16fb505fb7fc55281be8b05a60917cee"

S = "${WORKDIR}/dissector-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

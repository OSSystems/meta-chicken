SECTION = "devel/chicken"
DESCRIPTION = "Deserialization of Java Serialized Objects."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://s11n4j.meta;md5=2b98d4719e3dfffbff5a29a262414bf6"
DEPENDS_append_class-cross = " chicken-egg-comparse-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-comparse-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-comparse chicken-egg-comparse-crosssdk"
DEPENDS = " chicken-egg-comparse chicken-egg-comparse-cross"
RDEPENDS_${PN} = " chicken-egg-comparse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/s11n4j/s11n4j-${PV}.tar.gz"

SRC_URI[md5sum] = "acbb0c38f6347055d1943a74863aae1e"
SRC_URI[sha256sum] = "31686c8c11c73037d3a7a4443d0a00479f7a082479975db880fce7b80e7bde45"

S = "${WORKDIR}/s11n4j-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "Format procedures to generate output based on format strings."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://format-compiler.meta;md5=f3f22b86cd68c49c340f34355bd0c5c7"
DEPENDS_append_class-cross = " chicken-egg-embedded-test-cross chicken-egg-format-compiler-base-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-embedded-test-crosssdk chicken-egg-format-compiler-base-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-embedded-test nativesdk-chicken-egg-format-compiler-base chicken-egg-embedded-test-crosssdk chicken-egg-format-compiler-base-crosssdk"
DEPENDS = " chicken-egg-embedded-test chicken-egg-format-compiler-base chicken-egg-embedded-test-cross chicken-egg-format-compiler-base-cross"
RDEPENDS_${PN} = " chicken-egg-embedded-test chicken-egg-format-compiler-base"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/format-compiler/format-compiler-${PV}.tar.gz"

SRC_URI[md5sum] = "d8ef3d09e331546d4cc0e07965a63042"
SRC_URI[sha256sum] = "3ee298152c11f5282ceb55620b7ba41163726cad807462cc6566c01247188576"

S = "${WORKDIR}/format-compiler-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

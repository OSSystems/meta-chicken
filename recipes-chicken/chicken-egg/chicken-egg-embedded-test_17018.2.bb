SECTION = "devel/chicken"
DESCRIPTION = "A simple framework for unit tests that allows them to be embedded directly in programs' code."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://embedded-test.meta;md5=51522c0e934f2e93e0a11f1ea00b7060"
DEPENDS_append_class-cross = " chicken-egg-format-compiler-base-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-format-compiler-base-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-format-compiler-base chicken-egg-format-compiler-base-crosssdk"
DEPENDS = " chicken-egg-format-compiler-base chicken-egg-format-compiler-base-cross"
RDEPENDS_${PN} = " chicken-egg-format-compiler-base"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/embedded-test/embedded-test-${PV}.tar.gz"

SRC_URI[md5sum] = "e8b64e34cffc709cac98ac2912490c28"
SRC_URI[sha256sum] = "912d683dd55b52046974f0944041e990cb47b6fd6e46d8bc274f10236fb7a4c1"

S = "${WORKDIR}/embedded-test-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "A wire-server for cucumber"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://chickumber.meta;md5=bb851f26a22960ea650420b01449b03e"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-regex-literals-cross chicken-egg-test-cross chicken-egg-json-cross chicken-egg-missbehave-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-regex-literals-crosssdk chicken-egg-test-crosssdk chicken-egg-json-crosssdk chicken-egg-missbehave-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-regex-literals nativesdk-chicken-egg-test nativesdk-chicken-egg-json nativesdk-chicken-egg-missbehave chicken-egg-defstruct-crosssdk chicken-egg-regex-literals-crosssdk chicken-egg-test-crosssdk chicken-egg-json-crosssdk chicken-egg-missbehave-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-regex-literals chicken-egg-test chicken-egg-json chicken-egg-missbehave chicken-egg-defstruct-cross chicken-egg-regex-literals-cross chicken-egg-test-cross chicken-egg-json-cross chicken-egg-missbehave-cross chicken-egg-chickumber-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-regex-literals chicken-egg-test chicken-egg-json chicken-egg-missbehave"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/chickumber/chickumber-${PV}.tar.gz"

SRC_URI[md5sum] = "3d7b8a2fd264cd692de56e5648976a07"
SRC_URI[sha256sum] = "4373190464d54c07eac87be56ebfc6531236344b8a6299d238d07d7028d750d3"

S = "${WORKDIR}/chickumber-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

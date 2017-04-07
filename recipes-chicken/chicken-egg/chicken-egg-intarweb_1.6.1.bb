SECTION = "devel/chicken"
DESCRIPTION = "A more convenient HTTP library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://intarweb.meta;md5=7f89d034a36ac9aacda9e4c972172d5f"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-base64-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-base64 chicken-egg-defstruct-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-base64-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64 chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/intarweb/intarweb-${PV}.tar.gz"

SRC_URI[md5sum] = "61168257b09a675f9708b801b1de9894"
SRC_URI[sha256sum] = "8bf0f068a50cb3e31849da1cd3656f6c56e577465279aa56356a74d31f8d903b"

S = "${WORKDIR}/intarweb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

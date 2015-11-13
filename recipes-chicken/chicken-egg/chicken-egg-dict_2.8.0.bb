SECTION = "devel/chicken"
DESCRIPTION = "rfc2229 client api"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dict.meta;md5=a4bb1bab6c20d847aa185c34a7b51af0"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-md5-cross chicken-egg-message-digest-cross chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-md5-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-md5 nativesdk-chicken-egg-message-digest nativesdk-chicken-egg-utf8 chicken-egg-defstruct-crosssdk chicken-egg-md5-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-md5 chicken-egg-message-digest chicken-egg-utf8 chicken-egg-defstruct-cross chicken-egg-md5-cross chicken-egg-message-digest-cross chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-md5 chicken-egg-message-digest chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dict/dict-${PV}.tar.gz"

SRC_URI[md5sum] = "8e7a5fab6b488ec2ed1722a612b59c70"
SRC_URI[sha256sum] = "9148347f51b6df1288959459c779036c4d970475e866fb81757d761ffcbcdf98"

S = "${WORKDIR}/dict-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

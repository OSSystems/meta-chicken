SECTION = "devel/chicken"
DESCRIPTION = "An implementation of the CGI protocol as described in RFC 3875."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://cgi.meta;md5=4b20045d62a975ad87a5cc0c21593250"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-abnf-cross chicken-egg-datatype-cross chicken-egg-byte-blob-cross chicken-egg-utf8-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-abnf-crosssdk chicken-egg-datatype-crosssdk chicken-egg-byte-blob-crosssdk chicken-egg-utf8-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-input-classes nativesdk-chicken-egg-abnf nativesdk-chicken-egg-datatype nativesdk-chicken-egg-byte-blob nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-matchable chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-abnf-crosssdk chicken-egg-datatype-crosssdk chicken-egg-byte-blob-crosssdk chicken-egg-utf8-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-input-classes chicken-egg-abnf chicken-egg-datatype chicken-egg-byte-blob chicken-egg-utf8 chicken-egg-matchable chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-abnf-cross chicken-egg-datatype-cross chicken-egg-byte-blob-cross chicken-egg-utf8-cross chicken-egg-matchable-cross chicken-egg-cgi-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass chicken-egg-input-classes chicken-egg-abnf chicken-egg-datatype chicken-egg-byte-blob chicken-egg-utf8 chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cgi/cgi-${PV}.tar.gz"

SRC_URI[md5sum] = "716167687c2bda5cc660554e5b2b459d"
SRC_URI[sha256sum] = "a3655a2e21045af2bc56e938a0a605fb2fa816bf2344e00c5cbe7a1e815b3ed2"

S = "${WORKDIR}/cgi-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

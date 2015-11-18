SECTION = "devel/chicken"
DESCRIPTION = "Parser combinators for JavaScript Object Notation (JSON)."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://json-abnf.meta;md5=a156b2e7359ec2e9281160caf6017922"
DEPENDS_append_class-cross = " chicken-egg-abnf-cross chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-abnf-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-abnf nativesdk-chicken-egg-utf8 chicken-egg-abnf-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-abnf chicken-egg-utf8 chicken-egg-abnf-cross chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-abnf chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/json-abnf/json-abnf-${PV}.tar.gz"

SRC_URI[md5sum] = "cc6bd9ea044d37d62fdf2596a6c9a768"
SRC_URI[sha256sum] = "93682b8a81ff598b7eb0bef496632ee5bdec744db1dda050152c3844f957d7fa"

S = "${WORKDIR}/json-abnf-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

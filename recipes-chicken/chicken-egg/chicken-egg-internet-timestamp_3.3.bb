SECTION = "devel/chicken"
DESCRIPTION = "Parser combinators for internet timestamps (RFC 3339)."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://internet-timestamp.meta;md5=0c075205b51b1347bc91eb209fcae755"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross chicken-egg-abnf-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-abnf chicken-egg-typeclass-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-abnf chicken-egg-typeclass-cross chicken-egg-abnf-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass chicken-egg-abnf"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/internet-timestamp/internet-timestamp-${PV}.tar.gz"

SRC_URI[md5sum] = "e8747368911dd2c7658ea153fdff2a7b"
SRC_URI[sha256sum] = "0795b64a148af70ff031a5c251969e9506a2d9ba21a8c09da12175a70cda322b"

S = "${WORKDIR}/internet-timestamp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

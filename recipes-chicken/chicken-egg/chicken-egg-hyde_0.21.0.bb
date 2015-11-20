SECTION = "devel/chicken"
DESCRIPTION = "A static website compiler"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hyde.meta;md5=ed384d954a552bfdcc30a0eb20491de7"
DEPENDS_append_class-cross = " chicken-egg-filepath-cross chicken-egg-sxml-transforms-cross chicken-egg-doctype-cross chicken-egg-matchable-cross chicken-egg-scss-cross chicken-egg-spiffy-cross chicken-egg-colorize-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-svnwiki-sxml-cross chicken-egg-defstruct-cross chicken-egg-multidoc-cross chicken-egg-atom-cross chicken-egg-rfc3339-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-filepath-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-doctype-crosssdk chicken-egg-matchable-crosssdk chicken-egg-scss-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-colorize-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-svnwiki-sxml-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-multidoc-crosssdk chicken-egg-atom-crosssdk chicken-egg-rfc3339-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-filepath nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-doctype nativesdk-chicken-egg-matchable nativesdk-chicken-egg-scss nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-colorize nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-svnwiki-sxml nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-multidoc nativesdk-chicken-egg-atom nativesdk-chicken-egg-rfc3339 chicken-egg-filepath-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-doctype-crosssdk chicken-egg-matchable-crosssdk chicken-egg-scss-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-colorize-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-svnwiki-sxml-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-multidoc-crosssdk chicken-egg-atom-crosssdk chicken-egg-rfc3339-crosssdk"
DEPENDS = " chicken-egg-filepath chicken-egg-sxml-transforms chicken-egg-doctype chicken-egg-matchable chicken-egg-scss chicken-egg-spiffy chicken-egg-colorize chicken-egg-intarweb chicken-egg-uri-common chicken-egg-svnwiki-sxml chicken-egg-defstruct chicken-egg-multidoc chicken-egg-atom chicken-egg-rfc3339 chicken-egg-filepath-cross chicken-egg-sxml-transforms-cross chicken-egg-doctype-cross chicken-egg-matchable-cross chicken-egg-scss-cross chicken-egg-spiffy-cross chicken-egg-colorize-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-svnwiki-sxml-cross chicken-egg-defstruct-cross chicken-egg-multidoc-cross chicken-egg-atom-cross chicken-egg-rfc3339-cross chicken-egg-hyde-cross"
RDEPENDS_${PN} = " chicken-egg-filepath chicken-egg-sxml-transforms chicken-egg-doctype chicken-egg-matchable chicken-egg-scss chicken-egg-spiffy chicken-egg-colorize chicken-egg-intarweb chicken-egg-uri-common chicken-egg-svnwiki-sxml chicken-egg-defstruct chicken-egg-multidoc chicken-egg-atom chicken-egg-rfc3339"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hyde/hyde-${PV}.tar.gz"

SRC_URI[md5sum] = "9109f20125a1d72991772187370c8eaf"
SRC_URI[sha256sum] = "5b2214a39baa3816f7656b1493af84a2e0a81a3319c26671acd73160fd130576"

S = "${WORKDIR}/hyde-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
